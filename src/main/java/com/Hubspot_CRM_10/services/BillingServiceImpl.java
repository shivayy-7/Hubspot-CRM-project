package com.Hubspot_CRM_10.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Hubspot_CRM_10.entity.Billing;
import com.Hubspot_CRM_10.repository.BillingRepository;

@Service
public class BillingServiceImpl implements BillingService {
	
	@Autowired private BillingRepository billingRepo;

	@Override
	public void saveBill(Billing bill) {
		billingRepo.save(bill);
	}

	@Override
	public List<Billing> findAllBill() {
		List<Billing> bills = billingRepo.findAll();
		return bills;
	}

}
