package org.java.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx {
	public static void main(String[] args) {
		
		try {
			FileReader frd = new FileReader("D:\\ioex\\test.txt");
			int ch = 0; // 문자를 한개씩 담을 변수(하나씩 읽어야함, 입출력시)
			// -1: 문자열의 끝을 의미함, 읽다가 안읽혀지는 순간
			while ((ch = frd.read()) != -1) {
				System.out.print((char) ch);
			}
			if (frd != null)
				frd.close();
		} catch (FileNotFoundException e) {
			System.out.println("파일이 없다");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("입출력 에러");
			e.printStackTrace();
		}
	}
}
