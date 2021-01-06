package com.abc.package1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
//import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Input_outputLaunch4 {

	public static void main(String[] args) {// without using throws keyword->duccking

		String path1 = "null";
		String path2 = "null";
		FileReader fr = null;
		int temp = 0;
		FileWriter fw = null;

		try {
			path1 = "D:\\\\sample\\\\input.txt";
			path2 = "D:\\\\sample\\\\output.txt";
			fr = new FileReader(path1);
			br = new BufferedReader(fr);
			fw = new FileWriter(path2);
			bw = new BufferedWriter(fw);

			while ((temp = br.readLine()) != null) {
				bw.write(temp);
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
