package _2024_06_12;

import _2024_06_12.interfaces.ContactService;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@ToString
public class ContactServiceImpl implements ContactService {

    List<Contact> contactList = new ArrayList<>();

    @Override
    public boolean createNewContact(Contact contact) {
        for (int i = 0; i < contactList.size(); i++) {
            if (contact.getId() == contactList.get(i).getId()) {
                return false;
            }
        }
        return contactList.add(contact);
    }

    @Override
    public List<Contact> getContacts() {
        return contactList;
    }

    @Override
    public void refleshContact(int id, Contact contact) {
        deleteContactWithId(id);
        createNewContact(contact);

    }

    @Override
    public void deleteContactWithId(int id) {
        for (int i = 0; i < contactList.size(); i++) {
            if (id == contactList.get(i).getId()) {
                contactList.remove(i);
                return;
            }
        }
    }
}
