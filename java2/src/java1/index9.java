package java1;

import java.util.Scanner;

public class index9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Q. 두 개의 숫자를 입력하세요?");
		
		
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.printf("첫 번째 숫자 %a, 두 번째 숫자 %b",a,b);
		
		//sc라는 객체는 이미 nextInt. next를 사용하였으며,
		//nextLine 사용하지 
		

		System.out.println("Q. 두 명의 이름을 입력하세요");
		String c = sc.next();
		String d = sc.next();
		System.out.printf("첫 번째 이름: %c, 두 번째 이름 : %d", c,d);
		sc.close();
		
		System.out.println("Q. 주소를 입력하세요?");
		String e = sc.nextLine();
		System.out.println("주소:"+ e);
		sc.close();
	}

	
}
