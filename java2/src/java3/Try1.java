package java3;

import java.util.Scanner;

public class Try1 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //Scanner 코드문 찾아서 파일연결하기		
		int box; // 
		//try~catch : 예외 처리문
		try { //오류발생 시 체크
		System.out.println("숫자를 입력하세요?");
		box = sc.nextInt();
		
		}
		catch(Exception e) { //
			System.out.println(e);
			System.out.println("숫자만 입력하세요");
			}
	}
}
