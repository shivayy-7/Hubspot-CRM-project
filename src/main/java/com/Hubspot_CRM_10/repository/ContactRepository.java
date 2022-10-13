package com.Hubspot_CRM_10.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Hubspot_CRM_10.entity.Contact;

public interface ContactRepository extends JpaRepository<Contact, Long> {

}
