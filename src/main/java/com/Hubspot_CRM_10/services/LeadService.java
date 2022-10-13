package com.Hubspot_CRM_10.services;

import java.util.List;

import com.Hubspot_CRM_10.entity.Lead;

public interface LeadService {

	void saveLead(Lead lead);

	Lead findLeadById(long id);

	void deleteLeadById(long id);

	List<Lead> getAllLeads();

}
