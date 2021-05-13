package com.example.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {

	@Test
	public void test_a() {
		var t = new FizzBuzz();
		Assertions.assertEquals("", t.a(0));
		Assertions.assertEquals("", t.a(1));
		Assertions.assertEquals("", t.a(2));
		Assertions.assertEquals("Fizz", t.a(3));
		Assertions.assertEquals("", t.a(4));
		Assertions.assertEquals("Buzz", t.a(5));
		Assertions.assertEquals("Fizz", t.a(6));
		Assertions.assertEquals("", t.a(7));
		Assertions.assertEquals("", t.a(8));
		Assertions.assertEquals("Fizz", t.a(9));
		Assertions.assertEquals("Buzz", t.a(10));
		Assertions.assertEquals("", t.a(11));
		Assertions.assertEquals("Fizz", t.a(12));
		Assertions.assertEquals("", t.a(13));
		Assertions.assertEquals("", t.a(14));
		Assertions.assertEquals("FizzBuzz", t.a(15));
	}
}
