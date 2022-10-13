package com.Hubspot_CRM_10.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.Hubspot_CRM_10.entity.Contact;
import com.Hubspot_CRM_10.entity.Lead;
import com.Hubspot_CRM_10.services.ContactService;
import com.Hubspot_CRM_10.services.LeadService;
import com.Hubspot_CRM_10.utils.EmailService;

@Controller
public class EmailController {
	
	@Autowired private EmailService emailService;
	
	@Autowired private ContactService contactService;
	
	@Autowired private LeadService leadService;
	
	@RequestMapping("/sendEmail")
	public String sendEmail(@RequestParam("email") String email, @RequestParam("id") long id, ModelMap model) {
		model.addAttribute("email", email);
		model.addAttribute("id", id);
		return "compose_email";
	}
	
	@RequestMapping("/composeEmail")
	public String composeEmail(@RequestParam("to") String to,
	@RequestParam("sub") String sub, @RequestParam("body") String body,@RequestParam("id") long id, ModelMap model) {
		emailService.sendSimpleMessage(to, sub, body);
		model.addAttribute("sent", "Email Sent...");
		Lead lead = leadService.findLeadById(id);
		model.addAttribute("lead", lead);
		return "leadInfo";
	}
	
	@RequestMapping("/sendEmailContact")
	public String sendEmailContact(@RequestParam("email") String email, @RequestParam("id") long id, ModelMap model) {
		model.addAttribute("email", email);
		model.addAttribute("id", id);
		return "compose_email_contact";
	}
	
	@RequestMapping("/composeEmailContact")
	public String composeEmailContact(@RequestParam("to") String to,
	@RequestParam("sub") String sub, @RequestParam("body") String body, ModelMap model,
	@RequestParam long id) {
		emailService.sendSimpleMessage(to, sub, body);
		model.addAttribute("sent", "Email Sent...");
		Contact contact = contactService.findContactById(id);
		model.addAttribute("contact", contact);
		return "contactInfo";
		
	}
}
