package main.java.com.file.util;

import java.io.BufferedReader;
import java.io.IOException;

public class FileReversalUtility {

	private static FileReversalUtility fileReversalUtility = null;

	private FileReversalUtility() {
	}

	public static synchronized FileReversalUtility getInsatnce() {
		if (null != fileReversalUtility) {
			return fileReversalUtility;
		}
		return new FileReversalUtility();
	}

	public String reverseString(String input) {
		StringBuilder reversed = new StringBuilder(input);
		return reversed.reverse().toString();
	}

	public String reverseFileContent(BufferedReader bufferedReader) throws IOException {
		StringBuilder fileContent = new StringBuilder();
		String line;
		while ((line = bufferedReader.readLine()) != null) {
			fileContent.append(line).append(System.lineSeparator());
		}
		String reversedContent = FileReversalUtility.getInsatnce().reverseString(fileContent.toString());
		return reversedContent;
	}

}
