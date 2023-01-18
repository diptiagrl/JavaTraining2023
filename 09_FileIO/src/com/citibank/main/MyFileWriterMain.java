package com.citibank.main;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

import com.citibank.main.domain.MyFileWriter;

public class MyFileWriterMain {

	public static void main(String[] args) {

		String data;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter path and file name with extension");
		String path = scanner.next();

		scanner.nextLine();
		System.out.println("Enter data: ");

		data = scanner.nextLine();

		File file = new File(path);
		MyFileWriter myFileWriter = null;
		FileWriter fileWriter = null;
		try {
			fileWriter = new FileWriter(file, true);

			myFileWriter = new MyFileWriter(fileWriter, data);
			if (myFileWriter.writeFile()) {
				System.out.println("Check file");
			} else {
				System.out.println("Error writing file");
			}
		} catch (IOException e) {
			System.out.println("error");
		}

	}

}
