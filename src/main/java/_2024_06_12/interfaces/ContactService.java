package _2024_06_12.interfaces;

import _2024_06_12.Contact;

import java.util.List;

public interface ContactService {
    boolean createNewContact(Contact contact);

    List<Contact> getContacts();

    void refleshContact(int id, Contact contact);

    void deleteContactWithId(int id);
}
