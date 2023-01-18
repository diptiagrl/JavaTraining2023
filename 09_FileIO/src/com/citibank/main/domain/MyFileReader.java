package com.citibank.main.domain;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class MyFileReader {

	private char[] data;
	private int length;
	private File file;
	private Reader reader;
	private BufferedReader bufferedReader;
		
	public MyFileReader(File file, Reader reader) {
		super();
		this.file = file;
		this.reader = reader;
	}
	public MyFileReader(BufferedReader bufferedReader) {
		super();
		this.bufferedReader = bufferedReader;
		
	}
	
	public String readFileLineByLine() {
		String fileData = "";
		try {
			String temp = bufferedReader.readLine();
			do {
			fileData = fileData + temp + "\n" ;
			temp = bufferedReader.readLine();
			} 
			while(temp!=null);
			return fileData;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Error reading buffered data");
			return "";
		}finally {
			try {
				bufferedReader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("Error closing buffered data file!!");
			}
		}
		
		
	}
	
	public String readFile() {
		try {
			length = (int) file.length();
			data = new char[length];
			reader.read(data);
			String dataFromFile = new String(data);
			return dataFromFile; 
			
		} catch (IOException e) {
			System.out.println("Error while reading file!!");
			return "Error reading file";
		} finally {
			try {
				reader.close();
			} catch (IOException e) {
				System.out.println("Error closing file!!");
			}
		}
		
		
		
	}
	
	
}
