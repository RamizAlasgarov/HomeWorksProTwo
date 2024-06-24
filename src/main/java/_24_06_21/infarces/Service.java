package _24_06_21.infarces;

import _24_06_21.Contact;

import java.util.List;

public interface Service {
    List<Contact> readContact();

    List<Contact> addContact();

    List<Contact> updateContact(Contact contact);

    List<Contact> deleteContact(Contact contact);
}
