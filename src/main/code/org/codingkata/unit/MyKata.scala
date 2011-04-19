package org.codingkata.unit;

import _root_.org.codingkata.unit.api.BaseKataSolution;

class MyKata extends BaseKataSolution {
 
    // YOUR IMPLEMENTATION
	def answer(number: Int): String = {
		
		var result = ""
		
		if (number%3 == 0)
			result = "fizz"
		if (number%5 == 0)
			result += "buzz"
				
		if (result.length == 0)
			result = number.toString()
			
		result
	}
}
