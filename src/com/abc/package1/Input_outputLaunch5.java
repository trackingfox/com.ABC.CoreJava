package com.abc.package1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
//import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

public class Input_outputLaunch5 {

	public static void main(String[] args) {// without using throws keyword->duccking

		String path1 = null;
		String path2 = null;
		FileReader fr = null;
		String temp = null;
		FileWriter fw = null;
		BufferedWriter bw = null;
		BufferedReader br = null;

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
				br.close();
				bw.close();
				fr.close();
				fw.close();

			} catch (Exception f) {

				System.out.println("Unable to close");
			}
		}
	}
}
