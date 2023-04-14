package java1;

public class index3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		a = 10;
		b = 20;
		
		if(a < b) {
			System.out.println("b값이 더 큽니다");
		}
		else if( a > b) {
			System.out.print("a값이 더 큽니다.");
		}
		
		else{
			System.out.println("두 값이 같습니다");
		}
		
		//응용문제 1.
				//1번 항목은 숫자 10, 9, 22, 이며,
				//2번 항목의 숫자는 19, 10, 2 입니다.
		
		
		String userid = "hong";
		String userpw = "a123456";
		
			if(userid=="hong" && userpw=="a123456") {
				
				System.out.println("로그인 되었습니다.");
			}
			else {
				System.out.println("아이디 및 패스워드를 확인하세요");
			}
			
			int a1 = 101;
			double a2 = a1 / (double)3;
			System.out.println(a2);
			
			int b1 = 500;
			String b2 = Integer.toString(b1);
			System.out.println(b2);
			//문자를 숫자로 변환				
			
			
			
			// run : control+ f11
		
	}

}
