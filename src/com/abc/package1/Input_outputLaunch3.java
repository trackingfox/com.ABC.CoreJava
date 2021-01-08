package com.abc.package1;

//import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Input_outputLaunch3 {

	public static void main(String[] args) {// without using throws keyword->duccking

		String path1 = null;
		String path2 = null;
		FileReader fr = null;
		int temp = 0;
		FileWriter fw = null;

		try {
			path1 = "D:\\\\sample\\\\input.txt";
			path2 = "D:\\\\sample\\\\output.txt";

			while ((temp = fr.read()) != -1) {
				fw.write(temp);
			}
		} catch (Exception e) {
			System.out.println("IO operation not done");
		}

		finally {
			try {
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
