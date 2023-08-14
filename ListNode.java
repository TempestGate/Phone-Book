//Programmer: Luis Lopez
//Date: 7/17/23
/*ListNode class: Represents a node in the linked list. It contains fields such as firstName, 
lastName, address, city, phoneNumber, and a reference to the next node (next). It provides a
 constructor to initialize the node with the given data. */
 
public class ListNode {
    public String firstName;
    public String lastName;
    public String address;
    public String city;
    public String phoneNumber;
    public ListNode next;

    public ListNode(String firstName, String lastName, String address, String city, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.phoneNumber = phoneNumber;
        this.next = null;
    }
}
