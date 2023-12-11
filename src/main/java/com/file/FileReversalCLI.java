package main.java.com.file;

import java.util.Scanner;

import main.java.com.file.service.FileReversal;

public class FileReversalCLI {

	public static void main(String args[]) {
		try {
			Scanner in = new Scanner(System.in);
			System.out.println("Enter input file path:\n");
			String inputFilePath = in.nextLine();
			System.out.println("Enter prefered output file path:\n");
			String outputFilePath = in.nextLine();
			FileReversal fileReversal = new FileReversal();
			fileReversal.getReversedFile(inputFilePath, outputFilePath);
		} catch (Exception e) {
			System.out.println("Failed to receive the desired inputs to process further");
		}
	}
}
