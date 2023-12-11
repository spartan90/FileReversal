package main.java.com.file.service;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

import main.java.com.file.util.FileReversalUtility;

public class FileReversal {

	public void getReversedFile(String inputFile, String outputFile) {
		try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
				BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
			System.out.println("Please wait while the given file is been reversed...");
			System.out.println("Reversed file content="+FileReversalUtility.getInsatnce().reverseFileContent(reader));
			writer.write(FileReversalUtility.getInsatnce().reverseFileContent(reader));
			System.out.println("Please help to find reverse file =" + outputFile);
		} catch(Exception e) {
			System.out.println("Sorry the file was not been reversed successfully due to ="+e.toString());
		}
	}
}
