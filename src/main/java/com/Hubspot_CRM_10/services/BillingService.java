package com.Hubspot_CRM_10.services;

import java.util.List;

import com.Hubspot_CRM_10.entity.Billing;

public interface BillingService {

	void saveBill(Billing bill);

	List<Billing> findAllBill();

}
