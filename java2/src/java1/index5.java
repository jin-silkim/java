package java1;

//scanner Class 활용법

import java.util.Scanner;

//System.in(입력) != System.out(출력);

	//new : 객체를 선언하는 것을 말함

class index5 {

	//숫자형태의 스캐너
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner b = new Scanner(System.in);
		System.out.println("Q. 당신의 나이는?");
		int age = b.nextInt();
		System.out.println(age);
		
		b.close(); //스캐너 종료
		
		
	}

}
