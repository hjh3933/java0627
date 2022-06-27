package org.java.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamEx2 {
	public static void main(String[] args) {

		// ����� ���� �ҷ����̴� Ŭ����
		try {
			FileOutputStream fout = new FileOutputStream("C:\\test.out");
			FileInputStream fin = null;
			for (int i = 0; i < 10; i++) {
				int n = 10 - i;
				fout.write(n);
			}
			if (fout != null)
				fout.close();

			fin = new FileInputStream("C:\\test.out");
			int ch;
			while ((ch = fin.read()) != -1) {
				System.out.print(ch + " ");	//���ڴϱ� �տ� (char)����
			}
			if (fin != null) {
				fin.close();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
