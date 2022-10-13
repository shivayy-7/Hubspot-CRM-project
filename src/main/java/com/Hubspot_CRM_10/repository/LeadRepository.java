package com.Hubspot_CRM_10.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Hubspot_CRM_10.entity.Lead;

@Repository
public interface LeadRepository extends JpaRepository<Lead, Long> {

}
