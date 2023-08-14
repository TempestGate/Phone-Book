//Programmer: Luis Lopez
//Date: 7/17/23
/* PhonebookManager class: Manages the phone book, which is implemented as a 
linked list of ListNode objects. It has methods to add an entry to the phone
 book, delete an entry, search for an entry, and print the phone book. The head 
 field represents the first node of the linked list.*/
 
public class PhonebookManager {
    private ListNode head;

    public PhonebookManager() {
        this.head = null;
    }

    public void addEntry(String firstName, String lastName, String address, String city, String phoneNumber) {
        ListNode newNode = new ListNode(firstName, lastName, address, city, phoneNumber);

        if (head == null) {
            head = newNode;
        } else {
            ListNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void deleteEntry(String phoneNumber) {
        if (head == null) {
            System.out.println("Phonebook is empty.");
            return;
        }

        if (head.phoneNumber.equals(phoneNumber)) {
            head = head.next;
            System.out.println("Entry deleted successfully.");
            return;
        }

        ListNode prev = head;
        ListNode current = head.next;

        while (current != null) {
            if (current.phoneNumber.equals(phoneNumber)) {
                prev.next = current.next;
                System.out.println("Entry deleted successfully.");
                return;
            }
            prev = current;
            current = current.next;
        }

        System.out.println("Entry with phone number " + phoneNumber + " not found.");
    }

    public ListNode searchEntry(String searchTerm) {
        if (head == null) {
            System.out.println("Phonebook is empty.");
            return null;
        }

        ListNode current = head;
        while (current != null) {
            if (current.firstName.equalsIgnoreCase(searchTerm) || current.lastName.equalsIgnoreCase(searchTerm) || current.phoneNumber.equals(searchTerm)) {
                return current;
            }
            current = current.next;
        }

        System.out.println("Entry with search term '" + searchTerm + "' not found.");
        return null;
    }

    public void printPhonebook() {
        if (head == null) {
            System.out.println("Phonebook is empty.");
            return;
        }

        System.out.println("Phonebook Entries:");
        ListNode current = head;
        while (current != null) {
            System.out.println("First Name: " + current.firstName);
            System.out.println("Last Name: " + current.lastName);
            System.out.println("Address: " + current.address);
            System.out.println("City: " + current.city);
            System.out.println("Phone Number: " + current.phoneNumber);
            System.out.println("-----------------------------");
            current = current.next;
        }
    }
}