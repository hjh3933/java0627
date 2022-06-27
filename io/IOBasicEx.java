package org.java.io;

import java.io.IOException;
import java.io.InputStream;

public class IOBasicEx {
	public static void main(String[] args) {
		
		try {
			System.out.println("입출력");
			InputStream inputStream = System.in;
			int n = inputStream.read();
			System.out.println("출력문자: "+(char) n);
			inputStream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
