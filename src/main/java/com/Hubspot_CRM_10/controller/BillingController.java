package com.Hubspot_CRM_10.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.Hubspot_CRM_10.entity.Billing;
import com.Hubspot_CRM_10.entity.Contact;
import com.Hubspot_CRM_10.services.BillingService;
import com.Hubspot_CRM_10.services.ContactService;

@Controller
public class BillingController {
	
	@Autowired private BillingService billingService;
	
	@Autowired private ContactService contactService;
	
	@RequestMapping("/billInfo")
	public String billInfo(@RequestParam("id") long id, ModelMap model) {
		Contact contact = contactService.findContactById(id);
		model.addAttribute("contact", contact);
		return "create_bill";
	}
	
	@RequestMapping("/createBill")
	public String createBill(@ModelAttribute Billing bill, ModelMap model) {
		billingService.saveBill(bill);
		List<Billing> bills = billingService.findAllBill();
		model.put("bills", bills);
		return "search_bills";
	}

}
