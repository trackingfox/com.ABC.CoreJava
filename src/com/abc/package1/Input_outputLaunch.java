package com.abc.package1;

//import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Input_outputLaunch {

	public static void main(String[] args) throws IOException {

		String path1 = "D:\\sample\\input.txt";
		String path2 = "D:\\sample\\output.txt";
		FileInputStream fis = new FileInputStream(path1);
		int temp;
		FileOutputStream fos = new FileOutputStream(path2);

		while ((temp = fis.read()) != -1) {// -1 means end of file not the value.
			fos.write(temp);
		}

	}

}
