package java1;

import java.util.Scanner;

public class index7 {

	public static void main(String[] args) {
	
		Scanner a = new Scanner(System.in);
		System.out.println("아이디를 입력하세요?");
		
		String mid = a.next();
		if(mid.equals("A")|| mid.equals("B")) {
			System.out.println("회원이 확인 되었습니다.");			
		}
		else {
			System.out.println("비회원 입니다");
		}
		a.close();

		/*응용문제 1.
		 사용자가 원하는 숫자를 입력합니다. 단, 해당 숫자가
		 100이하 숫자만 입력해야 하며, 100초과 일 경우
		 "숫자는 100까지만 입력 가능합니다." 라는 메세지가 출력되도록 제작하시오.
		 */
		Scanner b = new Scanner(System.in);
		System.out.print("Q. 1~100까지 숫자를 입력하세요?");
		
		int n = b.nextInt();
			if(n > 100) {
				System.out.println("숫자는 100까지만 입력 가능합니다.");
			}
			else { System.out.print(n);
				}
			}
}
				