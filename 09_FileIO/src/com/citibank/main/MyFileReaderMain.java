package com.citibank.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

import com.citibank.main.domain.MyFileReader;
import com.citibank.main.domain.ReadMyFile;

public class MyFileReaderMain {

	public static void main(String[] args) {
		String path = "C:/JavaTraining/readfile.txt";

		File file = new File(path);
		
		FileReader fileReader = null;
		MyFileReader myFileReader = null;
		BufferedReader bufferedReader = null;
		
		try {
			fileReader = new FileReader(file);
			bufferedReader = new BufferedReader(fileReader);
			myFileReader = new MyFileReader(bufferedReader);
			String data = myFileReader.readFileLineByLine();
			System.out.println(data);
		} catch (FileNotFoundException e) {
			
		}finally {
			try {
				fileReader.close();
				bufferedReader.close();
			} catch (IOException e) {
				System.out.println("Error in closing files");
			}
			
			
		}
		
		
//		try {
//			fileReader = new FileReader(file);
//
//			MyFileReader myFileReader = new MyFileReader(file, fileReader);
//			printLineByLine();
//
//			String data = myFileReader.readFile();
//			if (data.equals("")) {
//				System.out.println("Error reading file");
//			} else {
//				System.out.println(data);
//			}
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} finally {
//			try {
//				fileReader.close();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//
//	}
	}

//	private static void printLineByLine() {
//		BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
//
//	}

}
