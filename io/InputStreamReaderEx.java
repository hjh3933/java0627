package org.java.io;

import java.io.InputStreamReader;

public class InputStreamReaderEx {
	public static void main(String[] args) {
		
		InputStreamReader inRd = new InputStreamReader(System.in);
		
		while(true) {
			try {
				System.out.println("���ڸ� �Է�");
				int ch = inRd.read();
				//ctr + z ������ �Է� �����
				if(ch==-1) break;
//				inRd.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
