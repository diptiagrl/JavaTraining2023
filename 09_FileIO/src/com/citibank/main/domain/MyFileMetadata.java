package com.citibank.main.domain;

import java.io.File;
import java.util.Date;

public class MyFileMetadata {

	private String path = "C:\\JavaTraining\\test.txt";

	public void printFileMetadata() {
		File file = new File(path);
		if(file.exists()) {
			System.out.println("File Name :: " + file.getName());
			System.out.println("File Path :: " + file.getAbsolutePath());
			System.out.println("File Size :: " + file.length() + "bytes");
			System.out.println("Can Open :: " + file.canExecute());
			System.out.println("Can Read :: " + file.canRead());
			System.out.println("Can Write :: " + file.canWrite());
			Date lastModifiedDate = new Date(file.lastModified());
			//System.out.println("Last Modified :: " + file.lastModified());
			System.out.println("Last Modified :: " + lastModifiedDate);		
		}
		else {
			System.out.println("File does not exists");
			System.out.println("Enter valid path");
		}
	}

}
