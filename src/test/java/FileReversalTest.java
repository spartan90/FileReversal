package test.java;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import main.java.com.file.util.FileReversalUtility;

public class FileReversalTest {

	@Test
	public void testReverseString() {
		assertEquals("abcd", FileReversalUtility.getInsatnce().reverseString("dcba"));
		assertEquals("1234", FileReversalUtility.getInsatnce().reverseString("4321"));
		assertEquals("check me", FileReversalUtility.getInsatnce().reverseString("em kcehc"));
		assertEquals("", FileReversalUtility.getInsatnce().reverseString(""));
	}
}
