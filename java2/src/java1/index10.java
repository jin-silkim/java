package java1;

import java.util.Scanner; //ctrl + spacebar + enter : import - shortcut

public class index10 {
	//for문 + scanner
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*응용문제2
		 Q. 원하는 구구단 숫자를 입력하세요
		 사용자자가 원하는 숫자를 입력하면, 해당 숫자에 맞는 구구단 출력되도록 하시오.
		 예시) 3을 입력할 경우 구구단 3*1=3 부터 3*9= 27 까지 출력
		 */
		
		
		int a = 2;
		while( a < 10) {
					
		//System.out.println(a);
		a++;
		}		
		//do~while문	
		
		int b = 1;
		do {
			//System.out.printIn(b);
			System.out.println(b);
			b++;
			
		}while(b < 10);
				
		System.out.println( a + "x" + b);
		
		
		
		/*응용문제3 while 또는 do-while문로 작성
		 * 사용자가 2개의 숫자를 입력합니다.
		 두 숫자의 범위에 있는 모든 값을 더 하는 코드를 작성하시오.
		 예시) 10 15
		 10 + 11 + 12 + 13 + 14 + 15 : 결과값 출력	*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("두 개의 숫자를 입력하세요");
		int a1 = sc.nextInt();
		int a2 = sc.nextInt();
		int sum = sc.nextInt();
		
		sc.close();
		do {
			sum += a1;
			a1++;
		}while(a1 <= a2);
		
		System.out.println("\"최종 결과값은 ? %d 입니다.\", sum");
	}
}