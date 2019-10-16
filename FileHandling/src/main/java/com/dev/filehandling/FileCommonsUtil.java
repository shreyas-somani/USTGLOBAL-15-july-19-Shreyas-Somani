package com.dev.filehandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class FileCommonsUtil {

	public static void main(String[] args) throws IOException {
		File file = new File("D:/Text.txt");
		FileUtils.touch(file);
		//String byteCountToDisplaySize(file);

		if (file.exists()) {
			System.out.println("File Exists");
		} else {
			System.out.println("File Does not Exist");
		}
		//FileWriter helps to write stuff into the file
		FileWriter fileWriter = new FileWriter(file);
		fileWriter.write("How are you doing?");        
		//Always flush before close. Writing to file uses Buffering.
		fileWriter.flush();
		fileWriter.close();

//		FileUtils.deleteQuietly(file);
//		if (file.exists()) {
//			System.out.println("File Exists");
//		} else {
//			System.out.println("File Does not Exist");
//		}

	}

}
