package com.ibm.eis.test;

import static org.junit.jupiter.api.Assertions.*;



import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import com.ibm.eis.dao.DaoClass;
import com.ibm.eis.service.ServiceClass;

class ServiceClassTest {
	ServiceClass service;
	DaoClass dao;
	@BeforeEach
	void metFirst() {
	service = new ServiceClass();
	dao = new DaoClass();
	}
	@Test
	@Disabled
	
	void checkConnection() {
		
		System.out.println(dao.dbCon);
		assertEquals(dao.dbCon,null);
	}
	
	@Test
	@ParameterizedTest
	@ValueSource(strings = {"abcdef","asftdf","dfjdd"})
	void validateMobileNo(String mobileno) {
		boolean expected = true;
		boolean actual = service.checkMobileNo(mobileno);
		assertEquals(expected,actual);
	}
	
	@Test
	@ParameterizedTest
	@ValueSource(strings = {"227344864","123abcdA","1623abcd"})
	void checkPassword(String password) {
		boolean expected =true;
		boolean actual =service.validatePassword(password);
		assertEquals(expected,actual);
	}
	
	
	@Test
	void validatekName() {
		boolean expected = true;
		assertAll(
				()->assertEquals(expected,service.checkName("!fdk9")),
				()->assertEquals(expected,service.checkName("Pooja Verma")),
				()->assertEquals(expected,service.checkName("payal@123")
				));
	}
	
	
	}
