package addressBook;

class Main {
    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook();

        // new contact
        Contact contact = new Contact.ContactBuilder().setFirstName("John").build();

        addressBook.addContact(contact);

        for (Contact c: addressBook.getContacts()) {
            System.out.println(c.getFirstName());
        }

        System.out.println(addressBook.getLength());

        addressBook.removeContact(contact);

        System.out.println(addressBook.getLength());
    }
}