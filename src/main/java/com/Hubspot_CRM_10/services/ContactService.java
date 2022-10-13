package com.Hubspot_CRM_10.services;

import java.util.List;

import com.Hubspot_CRM_10.entity.Contact;

public interface ContactService {

	void saveContact(Contact contact);

	List<Contact> getAllContacts();

	Contact findContactById(long id);

}
