package _24_06_12;

public class Dev {
    public static void main(String[] args) {
        ContactServiceImpl contactService = new ContactServiceImpl();
        FakerContacts fakerContacts = new FakerContacts();
        Contact contact = new Contact(100, "qwe", 12313, "adsff@gmail.com");
        contactService.createNewContact(contact);
        fakerContacts.createTenContact(contactService.contactList).forEach(e -> System.out.println(e));


    }
}
