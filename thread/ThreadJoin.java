package org.java.thread;

class Thread1 extends Thread {
	@Override
	public void run() {
		for (int i =0; i<10; i++) {
			System.out.println("스레드"+currentThread().getName()+">>"+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
				return;
			}
		}
	}
}

public class ThreadJoin {
	public static void main(String[] args) {
		
		System.out.println("main스레드 시작");
		Thread1 t1 = new Thread1();
		t1.start();
		try {
			t1.join();	//thread를 종료할 때까지 밑의 실행문이 기다리게 하는 메소드
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("main스레드 종료");	//thread모두 끝나고 실행
	}
}
