package com.home.project.test;
import static org.junit.Assert.*;

import java.util.List;

import com.home.project.*;
import org.junit.Test;
public class LongestWordTest {
	
	@Test
	public void testLongestWord_trueCase(){
		LongestWord testObj = new LongestWord();
		List<String> compare = testObj.findLongestWord("Good Morning Vinay Bongarala");
		assertTrue("Bongarala".equals(compare.get(0)));
	}
	
	@Test
	public void testLongestWord_emptyStringCase(){
		LongestWord testObj = new LongestWord();
		List<String> compare = testObj.findLongestWord("");
		assertTrue(compare.isEmpty());
	}
	
	@Test
	public void testLongestWord_multipleWords(){
		LongestWord testObj = new LongestWord();
		List<String> compare = testObj.findLongestWord("cat dog red is am");
		assertTrue("cat".equals(compare.get(0)));
	}
	
	@Test
	public void testLongestWord_multipleWordssize(){
		LongestWord testObj = new LongestWord();
		List<String> compare = testObj.findLongestWord("cat dog red is am");
		assertTrue(3 == compare.size());
	}

	@Test
	public void testLongestWord_numberCase(){
		LongestWord testObj = new LongestWord();
		List<String> compare = testObj.findLongestWord("1235789jhb Vinay");
		assertTrue("1235789jhb".equals(compare.get(0)));
	}
	@Test
	public void testLongestWord_specialCharacters(){
		LongestWord testObj = new LongestWord();
		List<String> compare = testObj.findLongestWord("$#^*%#&(&^%#");
		assertTrue("$#^*%#&(&^%#".equals(compare.get(0)));
	}
	
	@Test
	public void testLongestWord_singleLongWord(){
		LongestWord testObj = new LongestWord();
		List<String> compare = testObj.findLongestWord("Thisisthelongestwordthereistotestthistestcase");
		assertTrue("Thisisthelongestwordthereistotestthistestcase".equals(compare.get(0)));
	}
	
	@Test
	public void testLongestWord_space(){
		LongestWord testObj = new LongestWord();
		List<String> compare = testObj.findLongestWord(" ");
		assertTrue("".equals(compare.get(0)));
	}
	
}
