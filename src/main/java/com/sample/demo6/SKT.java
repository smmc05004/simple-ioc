package com.sample.demo6;

public class SKT implements Telecom {

	public void send(String message) {
		System.out.println("["+message+"]를 SKT 통신망을 사용해서 전송합니다.");
	}
}
