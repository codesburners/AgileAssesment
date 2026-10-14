package com.baba.Agile1;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class Agile1ApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void testPositive()
	{

		Agile1Application application=new Agile1Application();
		assertEquals("Palindrome",application.testNum(101));
	}

	@Test
	void testNegative()
	{
		Agile1Application application=new Agile1Application();
		assertEquals("Not a palindrome",application.testNum(123));

	}

}
