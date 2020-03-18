package com.home.project.test;
import static org.junit.Assert.*;
import com.home.project.*;
import org.junit.Test;
public class LongestWordTest {
	
	@Test
	public void testLongestWord_trueCase(){
		LongestWord testObj = new LongestWord();
		assertTrue("Bongarala".equals(testObj.findLongestWord("Good Morning Vinay Bongarala")));
	}
	
	@Test
	public void testLongestWord_emptyStringCase(){
		LongestWord testObj = new LongestWord();
		assertTrue("".equals(testObj.findLongestWord("")));
	}
	
	@Test
	public void testLongestWord_nullCase(){
		LongestWord testObj = new LongestWord();
		assertTrue("".equals(testObj.findLongestWord(null)));
	}

	@Test
	public void testLongestWord_numberCase(){
		LongestWord testObj = new LongestWord();
		assertTrue("1235789jhb".equals(testObj.findLongestWord("1235789jhb Vinay")));
	}
}
