package org.java.io;

import java.io.IOException;
import java.io.InputStream;

public class IOBasicEx {
	public static void main(String[] args) {
		
		try {
			System.out.println("�����");
			InputStream inputStream = System.in;
			int n = inputStream.read();
			System.out.println("��¹���: "+(char) n);
			inputStream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
