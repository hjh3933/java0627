package org.java.io;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamEx {
	public static void main(String[] args) {

		try {
			FileOutputStream fos = new FileOutputStream("c:\\123.txt");

			// BufferedOutputStream�� ���� ũ�⸦ 5���Ѵ�
			BufferedOutputStream bos = new BufferedOutputStream(fos, 5);

			// ���� 123.txt�� 1���� 9���� ����Ѵ� 
			for (int i = '1'; i <= '9'; i++) {
				bos.write(i);
				//�ؽ�Ʈ���� Ȯ���غ��� ��������� 5������ 1,2,3,4,5��µǾ��ִ�
			}
			if(fos != null) fos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
