package org.java.io;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamEx {
	public static void main(String[] args) {

		try {
			FileOutputStream fos = new FileOutputStream("c:\\123.txt");

			// BufferedOutputStream의 버퍼 크기를 5로한다
			BufferedOutputStream bos = new BufferedOutputStream(fos, 5);

			// 파일 123.txt에 1부터 9까지 출력한다 
			for (int i = '1'; i <= '9'; i++) {
				bos.write(i);
				//텍스트파일 확인해보면 저장공간이 5까지라 1,2,3,4,5출력되어있다
			}
			if(fos != null) fos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
