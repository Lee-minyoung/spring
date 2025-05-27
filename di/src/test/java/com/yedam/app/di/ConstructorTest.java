package com.yedam.app.di;

import org.junit.Test;

public class ConstructorTest {

	@Test
	public void 기본생성자() {
		Employee emp = new Employee("아무개", 5000);
		// emp.setLname("kim");
		
		System.out.println(emp);
		
	}
}
 