package java1;

public class class3 {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box b = new Box();
		b.abc();

		}
	
	}

	class Box{
		public void abc() {//static void : 메모리에 할당 되는 메소드
		//단, static 사용하지 않을 경우 같은 pakage안에서 공유 가능
		//리턴 메소드
		}
	
		public String zzz() {
			String a = "거북선";
			return a;
		}
		public int kkk() {
			int a = 100;
			return a;
		}
		
		//Coupon
		public void bbb() {
			int a = 10000;
			double b = a / 0.5;
			System.out.println(b);
		}
	}
	
	
		class Coupon{
			public static void event() {
				int cp = 30;
				System.out.println(cp);
			}
		}

		
	
