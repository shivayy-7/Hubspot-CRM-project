package com.Hubspot_CRM_10.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Hubspot_CRM_10.entity.Contact;
import com.Hubspot_CRM_10.repository.ContactRepository;

@Service
public class ContactServiceImpl implements ContactService {
	
	@Autowired ContactRepository contactRepo;

	@Override
	public void saveContact(Contact contact) {
		contactRepo.save(contact);
	}

	@Override
	public List<Contact> getAllContacts() {
		List<Contact> contacts = contactRepo.findAll();
		return contacts;
	}

	@Override
	public Contact findContactById(long id) {
		Contact contact = contactRepo.findById(id).get();
		return contact;
	}

}
