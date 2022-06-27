package org.java.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx {
	public static void main(String[] args) {
		
		try {
			FileReader frd = new FileReader("D:\\ioex\\test.txt");
			int ch = 0; // ���ڸ� �Ѱ��� ���� ����(�ϳ��� �о����, ����½�)
			// -1: ���ڿ��� ���� �ǹ���, �дٰ� ���������� ����
			while ((ch = frd.read()) != -1) {
				System.out.print((char) ch);
			}
			if (frd != null)
				frd.close();
		} catch (FileNotFoundException e) {
			System.out.println("������ ����");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("����� ����");
			e.printStackTrace();
		}
	}
}
