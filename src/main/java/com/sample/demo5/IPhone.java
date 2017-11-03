package com.sample.demo5;

public class IPhone implements Phone {

	public void sms(String text) {
		System.out.println("["+text+"]를 IPhone로 보냅니다.");
	}
}
