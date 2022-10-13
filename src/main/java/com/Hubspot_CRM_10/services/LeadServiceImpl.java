package com.Hubspot_CRM_10.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Hubspot_CRM_10.entity.Lead;
import com.Hubspot_CRM_10.repository.LeadRepository;

@Service
public class LeadServiceImpl implements LeadService {
	
	@Autowired private LeadRepository leadRepo;

	@Override
	public void saveLead(Lead lead) {
		leadRepo.save(lead);
	}

	@Override
	public Lead findLeadById(long id) {
		Lead lead = leadRepo.findById(id).get();
		return lead;
	}

	@Override
	public void deleteLeadById(long id) {
		leadRepo.deleteById(id);
	}

	@Override
	public List<Lead> getAllLeads() {
		List<Lead> leads = leadRepo.findAll();
		return leads;
	}

}
