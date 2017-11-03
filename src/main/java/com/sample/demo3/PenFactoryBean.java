package com.sample.demo3;

import org.springframework.beans.factory.FactoryBean;

public class PenFactoryBean implements FactoryBean<Pen>{

	// getObject() 메소드가 반환하는 객체가 bean으로 등록됨
	public Pen getObject() throws Exception {
		Pen pen = new Pen() {
			public void draw() {
				System.out.println("연필로 그리기....");
			}
		};
		return pen;
	}

	// 실제 bean으로 등록되는 객체의 타입을 반환하는 메소드
	public Class<?> getObjectType() {
		return Pen.class;
	}

	// bean으로 등록되는 객체를 싱글턴으로 만들것인지 여부를 반환하는 메소드
	public boolean isSingleton() {
		return true;
	}
}
