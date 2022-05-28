// import java.util.*;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Jane", 309111, 309222, 309333);
        Person p2 = new Person("Janny", 101, 102, 103);
        Person p3 = new Person("Lala", 000, 111, 222);
        AddressBook book = new AddressBook();
        book.addToBook(p1);
        book.addToBook(p2);
        book.addToBook(p3);        
        System.out.print(book.nameList());
            
        System.out.print(book.search("Janny"));
    }
}
