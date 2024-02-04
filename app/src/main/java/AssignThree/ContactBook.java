package AssignThree;

import java.util.TreeMap;

public class ContactBook {
    private TreeMap<String, String> contactsMap;

    public ContactBook() {
        this.contactsMap = new TreeMap<>();
    }

    public void addContact(String contactName, String phoneNumber) {
        contactsMap.put(contactName, phoneNumber);
    }

    public String getPhoneNumber(String contactName) {
        return contactsMap.get(contactName);
    }

    public void removeContact(String contactName) {
        contactsMap.remove(contactName);
    }

    public void displayAllContacts() {
        System.out.println("Contact Book:");
        for (String contactName : contactsMap.keySet()) {
            System.out.println("Name: " + contactName + ", Phone Number: " + contactsMap.get(contactName));
        }
    }

    public static void main(String[] args) {
        ContactBook contactBook = new ContactBook();

        contactBook.addContact("Ketan", "3434423423");
        contactBook.addContact("Pankaj", "7497659764765");
        contactBook.addContact("Sapna", "43738787845");

        contactBook.displayAllContacts();

        String contactNameToRetrieve = "Sapna";
        String phoneNumber = contactBook.getPhoneNumber(contactNameToRetrieve);
        System.out.println("\nPhone Number of " + contactNameToRetrieve + ": " + phoneNumber);

        String contactNameToRemove = "Sapna";
        contactBook.removeContact(contactNameToRemove);

        System.out.println("\nAfter removing " + contactNameToRemove + ":");
        contactBook.displayAllContacts();
    }
}
