package Serialization;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Source {

	public static void main(String[] args) throws Exception {

		String path = "D:\\AdvancedJavaFiles\\Sample\\Cricket.txt";
		FileOutputStream fos = new FileOutputStream(path);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		Cricketer c = new Cricketer("Sachin", 248, 55.0f, 100.0f);
		oos.writeObject(c);
		c.disp();
		bos.flush();
	}

}
