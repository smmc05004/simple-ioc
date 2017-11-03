package com.sample.demo6;

import java.util.Map;

public class MessageService {

	private Map<String, Telecom> telecomMap;
	public void setTelecomMap(Map<String, Telecom> telecomMap) {
		this.telecomMap = telecomMap;
	}
	
	public void sendMessage(String message, String telecome) {
		Telecom company = telecomMap.get(telecome);
		if(company != null) {
			company.send(message);
		}
	}
}
