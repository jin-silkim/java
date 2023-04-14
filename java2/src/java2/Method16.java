package java2;

public class Method16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		green g = new green(); //부모 클래스 인스턴스 생성
		g.setter(10, 20);
		green.blue gb = g.new blue(); //부모 클래스 안에 자식 클래스 인스턴스 생성
		gb.print();
		
	}

}


class green{ //부모 class
	int aa,bb;
	String name = "홍길동";
/*	String userage = "";*/
	
	public void setter(int a, int b) {
		this.aa = a;
		this.bb = b;
		System.out.println(); //자식 클래스에 있는 값을 가져올 때 
	}
	
	class blue{ //자식 class
		int a1 = green.this.aa;
		int b1 = green.this.bb;
		String age = "30";
		public void print() {
			System.out.println(green.this.name);
			System.out.println(a1*b1);
		}
	}
	
	/*class blue{
		int a1 = green.this.aa;
		int b1 = green.this.bb;
		public void print() {
	}*/
}
