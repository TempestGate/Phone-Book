//Programmer: Luis Lopez
//Date: 7/17/23
/* TestClass class: Contains the main() method that serves as the entry point of the program. 
It demonstrates the usage of the PhonebookManager class by creating an instance of it, adding
entries to the phone book, searching for an entry, deleting an entry, and printing the phone book.*/

/* Search Entry: Implement a method that allows searching for an entry by name or phone number and returns the matching entry.*/

public class TestClass {
    public static void main(String[] args) {
        PhonebookManager phonebook = new PhonebookManager();

        phonebook.addEntry("John", "Doe", "123 Main St", "Cityville", "123-456-7890");
        phonebook.addEntry("Jane", "Smith", "456 Elm St", "Townsville", "987-654-3210");

        phonebook.printPhonebook();

        ListNode foundEntry = phonebook.searchEntry("Doe");
        if (foundEntry != null) {
            System.out.println("Entry found:");
            System.out.println("First Name: " + foundEntry.firstName);
            System.out.println("Last Name: " + foundEntry.lastName);
            System.out.println("Address: " + foundEntry.address);
            System.out.println("City: " + foundEntry.city);
            System.out.println("Phone Number: " + foundEntry.phoneNumber);
        }

        phonebook.deleteEntry("123-456-7890");

        phonebook.printPhonebook();
    }
}







