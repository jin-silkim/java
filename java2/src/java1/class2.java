package java1;

// 외부 class 및 외부 메소드 활용
	class abc{
	String user2 = "이순신";
	}
	
	/*
	  응용문제 1. 외부 class를 이용해 2개의 숫자 값을
	  외부 class 안에 있는 메소드를 이용하여 짝수인지 홀수 인지 검토하는 코드를 작성하시오.
	 */
	public class class2 {	
	public static void main(String[] args) {
		abc a = new abc();
		System.out.println(a.user2);
	}
	}
/*
 [접근 제어자]
 public : 기본으로 필요 시 접근이 용이하게 사용 
 privation : 자신의 클래스 내에서만 접근이 됨 (같은 패키지 아니어도 됨)
 protected : 같은 패키지 안에서 파생되는 클래스만 접근이 됨
 외부 클래스 : defalt (동일한 패키지로만 접속이 됨)
 */
	class Inject{
		//user 메소드에 두 개의 인지값 및 자료형을 받는 형태
		public static void user(String name, String pw) {
			
				
		}
	}
