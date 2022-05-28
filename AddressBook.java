import java.util.*;

public class AddressBook {
    private Map<String, Map<String, Integer>> book;


    public AddressBook() {
        book = new HashMap<>();
    }


    public void addToBook(Person person) {
        Map<String, Integer> numberInfo = new HashMap<>();
        numberInfo.put("phone number", person.getPhoneNumber());
        numberInfo.put("home number", person.getHomeNumber());
        numberInfo.put("office number", person.getOfficeNumber());
        book.put(person.getName(), numberInfo);
    }

    Person person;


    public String[] nameList() {
        //return in alphabetical order
        String[] names = new String[book.size()];
        int i = 0;
        for (Map.Entry<String, Map<String, Integer>> b : book.entrySet()) {
            names[i] = b.getKey();
            i++;
        }
        Arrays.sort(names);
        System.out.print(Arrays.toString(names));
        return names;
    }

    
    public Map<String, Integer> search(String name) {
        //search name appear all telephone numbers
        for (Map.Entry<String, Map<String, Integer>> b : book.entrySet()) {
            if (b.getKey() == name) {
                return b.getValue();
            }
        } 
        return null;
    }
}

