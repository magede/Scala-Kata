package org.codingkata.unit

import org.scalatest.testng.TestNGSuite
import org.testng.annotations.Test


class KataTest extends TestNGSuite {

	val fizzbuzz = new MyKata
	
	@Test
	def normalNumberGivesNumber() {
		
		val normalNumbers = List(1,2,4,7,8,11);
		
		for (normalNumber <- normalNumbers) {
			assert(normalNumber.toString().equals(fizzbuzz.answer(normalNumber)) )
		}
		
		
	}

}