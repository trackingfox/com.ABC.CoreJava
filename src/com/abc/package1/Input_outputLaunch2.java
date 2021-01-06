package com.abc.package1;

//import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Input_outputLaunch2 {

	public static void main(String[] args) throws IOException {

		String path1 = "D:\\sample\\input.txt";
		String path2 = "D:\\sample\\output.txt";
		FileReader fr = new FileReader(path1);
		int temp;
		FileWriter fw = new FileWriter(path2);

		while ((temp = fr.read()) != -1) {// -1 means end of file not the value.
			fw.write(temp);
		}

		fw.flush();

	}

}
