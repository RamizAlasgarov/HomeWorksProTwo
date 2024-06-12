package _2024_06_12;

public class Dev {
    public static void main(String[] args) {
        ContactServiceImpl contactService = new ContactServiceImpl();
        FakerContacts fakerContacts = new FakerContacts();
        Contact contact = new Contact(100, "qwe", 12313, "adsff@gmail.com");
        contactService.createNewContact(contact);
        contactService.createNewContact(contact);
        contactService.createNewContact(contact);
        contactService.createNewContact(contact);
        contactService.createNewContact(contact);
        contactService.createNewContact(contact);
        contactService.createNewContact(contact);
        contactService.createNewContact(contact);
        fakerContacts.createTenContact(contactService.contactList);
        contactService.getContacts().forEach(e -> System.out.println(e));
        System.out.println("-------------------------------------");
        contactService.deleteContactWithId(100);
        System.out.println(contactService.getContacts());
    }
}
