package com.citibank.main;

import com.citibank.main.domain.MyFileMetadata;
import com.citibank.main.domain.ReadMyFile;

public class MyFileMetadataMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//MyFileMetadata myFileMetadata = new MyFileMetadata();
		
		//myFileMetadata.printFileMetadata();
		
		ReadMyFile readMyFile = new ReadMyFile();
		readMyFile.readFile();

	}

}
