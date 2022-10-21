package com.junit.test;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class TestApplicationTests {

	@Test
	void twoPlusTwoShouldEqualOneFour(){
		var calculator = new Calculator();
		assertEquals(4, calculator.add(2,2));

	}

	@Test
	void threePlusSevenShouldEqualTen(){
		var calculator = new Calculator();
		assertEquals(10, calculator.add(3,7));

	}

}
