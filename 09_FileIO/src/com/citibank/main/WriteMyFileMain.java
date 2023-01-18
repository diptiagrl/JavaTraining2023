package com.citibank.main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

import com.citibank.main.domain.WriteMyFile;

public class WriteMyFileMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter path and file name with extension");
		String path = scanner.next();
	
		scanner.nextLine();
		System.out.println("Enter data: ");
		
		String data = scanner.nextLine();
				
		File file = new File(path);
		
		OutputStream outputStream = null;
		try {
			outputStream = new FileOutputStream(file);
			outputStream = new FileOutputStream(file,true);
		
		WriteMyFile writeMyFile = new WriteMyFile(outputStream, data);
		if (writeMyFile.writeFile()) {
			System.out.println("check your file");
		}
		else {
			System.out.println("Failed to write file");
		}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				outputStream.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		}
}
