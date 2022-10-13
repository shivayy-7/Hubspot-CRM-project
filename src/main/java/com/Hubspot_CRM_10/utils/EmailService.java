package com.Hubspot_CRM_10.utils;

public interface EmailService {
	
	public void sendSimpleMessage(
		      String to, String subject, String text);

}
