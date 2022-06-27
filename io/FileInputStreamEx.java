package org.java.io;

import java.io.FileInputStream;

public class FileInputStreamEx {
	public static void main(String[] args) {

		try {
			FileInputStream in = new FileInputStream("C:\\Windows\\system.ini");

			int ch = 0;

			while ((ch = in.read()) != -1) {
				System.out.print((char) ch);
			}
			if (in != null)
				in.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
