package com.sample.demo5;

public class Galaxy implements Phone{

	public void sms(String text) {
		System.out.println("["+text+"]를 Galaxy로 보냅니다.");		
	}
}
