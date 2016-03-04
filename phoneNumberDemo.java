import java.util.ArrayList;
import java.util.Scanner;

public class phoneNumberDemo {
    public static void main(String[] args) {

        ArrayList list = new ArrayList();
        list.add(new PhoneBook("mohamed", 123));
        list.add(new PhoneBook("hala" , 234));
        list.add(new PhoneBook("maila" , 345));
        list.add(new PhoneBook("meme" , 456));
        list.add(new PhoneBook("yazin" , 567));

        for (int x = 0; x < list.size(); ++x) {
            PhoneBook person = (PhoneBook) list.get(x);
            System.out.println("Person " + (x+1) + " Name: " + person.getName() + "\nPhone number: " + person.getPhoneNumber());
        }

    }
}
