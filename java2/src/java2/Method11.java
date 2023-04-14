package java2;

public class Method11 {
 //상속메소드 형태2
	
	public static void main(String[] args) {
		
		student st = new student();
//		st.info("홍길동","30");
	}

}

class person{
	protected String name; //같은 클래스 및 상속 클래스 모든 접근이 가능 단, 외부 별도의 클래스에서 접근이 안됨
	protected String age; //단, 외부 별도의 클래스에서 접근이

//settter
//	public void info() {String name, String age){
		this.name = name;
		this.age = age;
	}
	public void print() {
		System.out.println("고객명:" + this.name);
	}
	
	
}

class student extends person{
	@Override
	
	
