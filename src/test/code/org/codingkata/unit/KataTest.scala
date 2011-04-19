package org.codingkata.unit

import org.scalatest.testng.TestNGSuite
import org.testng.annotations.Test


class KataTest extends TestNGSuite {

	val fizzbuzz = new MyKata
	
	@Test
	def testNormalNumberGivesNumber() {
		
		val normalNumbers = List(1,2,4,7,8,11);
		
		for (normalNumber <- normalNumbers) {
			assert(normalNumber.toString().equals(fizzbuzz.answer(normalNumber)) )
		}
	}
	
	@Test
	def testFizzNumbers() {
		val fizzNumbers = List(3,6,9,12,33);
		
		fizzNumbers.foreach((i : Int) => (
			assert("fizz".equals(fizzbuzz.answer(i)) )
		))
		
		//fizzNumbers.foreach(assert("fizz".equals(fizzbuzz.answer(_)) ))
	}
	
	@Test
	def testBuzzNumbers() {
		val buzzNumbers = List(5,10,55,2015);
		
		buzzNumbers.foreach((i : Int) => (
			assert("buzz".equals(fizzbuzz.answer(i)) )
		))
		
	}
	
	@Test
	def testFizzBuzzNumbers() {
		val fizzBuzzNumbers = List(15,30,150,60);
		
		fizzBuzzNumbers.foreach((i : Int) => (
			assert("fizzbuzz".equals(fizzbuzz.answer(i)) )
		))
		
	}

}