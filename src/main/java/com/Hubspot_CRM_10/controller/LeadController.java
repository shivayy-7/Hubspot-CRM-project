package com.Hubspot_CRM_10.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.Hubspot_CRM_10.entity.Lead;
import com.Hubspot_CRM_10.services.LeadService;

@Controller
public class LeadController {
	
	@Autowired LeadService leadService;
	
	@RequestMapping("/view")
	public String view() {
		return "create_lead";
	}
	
	@RequestMapping("/saveLead")
	public String saveLead(@ModelAttribute Lead lead, ModelMap model) {
		try {
			leadService.saveLead(lead);
			model.put("lead", lead);
			
		} catch (Exception e) {
			model.addAttribute("msg", "Email id or number already exist !!");
			return "create_lead";
		}
		return "leadInfo";
		
	}
	
	@RequestMapping("/allLeads")
	public String allLeads(ModelMap model) {
		List<Lead> leads = leadService.getAllLeads();
		model.addAttribute("leads", leads);
		return "Lead_search_result";
	}
	
	@RequestMapping("/leadInfo")
	public String leadInfo(@RequestParam("id") long id, ModelMap model) {
		Lead lead = leadService.findLeadById(id);
		model.addAttribute("lead", lead);
		return "leadInfo";
	}
	
	@RequestMapping("/updateInfo")
	public String updateInfo(@RequestParam("id") long id, ModelMap model) {
		Lead lead = leadService.findLeadById(id);
		model.put("lead", lead);
		return "update_Lead";
	}
	
	@RequestMapping("/update")
	public String update(@ModelAttribute Lead lead, ModelMap model) {
		leadService.saveLead(lead);
		model.addAttribute("update", "Data is updated....");
		List<Lead> leads = leadService.getAllLeads();
		model.addAttribute("leads", leads);
		return "Lead_search_result";
	}

}
