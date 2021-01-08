package com.abc.package1;

import java.io.File;

public class Input_outputLaunch6 {

	public static void main(String[] args) {// without using throws keyword->duccking

		String path1 = "D:\\\\sample\\\\input.txt";
		File f = new File(path1);

		if (f.exists() == true) {
			if (f.isFile() == true) {
				System.out.println("It is a file");
			} else {
				System.out.println("it is a folder");
			}
		} else {
			System.out.println("Invalid path");
		}

	}
}
