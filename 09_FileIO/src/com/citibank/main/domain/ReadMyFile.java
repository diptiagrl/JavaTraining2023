package com.citibank.main.domain;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReadMyFile {
	private String path = "C:/JavaTraining/test.txt";
	private InputStream inputStream;
	// private byte[] data = new byte[100];
	private byte[] data;
	private int arrayLength;

	public void readFile() {
		try {
			File file = new File(path);
			arrayLength = (int) file.length();
			data = new byte[arrayLength];

			inputStream = new FileInputStream(path);
			inputStream.read(data);
			for (byte b : data) {
				System.out.print((char) b);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("File Not Found!!");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Error in reading file!!");
		} catch (Exception e) {
			System.out.println("Program ends");
		} finally {
			try {
				inputStream.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("Error in Closing File");
			}
			catch (Exception e2) {
				System.out.println("Error while closing");
			}
		}
	}

}
