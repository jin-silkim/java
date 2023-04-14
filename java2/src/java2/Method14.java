package java2;

public class Method14 {
	//Object 클래스
	public static void main(String[] args) {
		test1 t = new test1();
		t.info("홍길동","30");
		System.out.println(t);
	
	}
	
}

class test1{
	private String name;
	private String age;
	public void info(String n, String a) {//object : 숫자, 문자, 모두 받기 위한
		this.name = n;
		this.age = a;
	}
}

class test1 extends object{
	public String toString() { //객체를 문자열로 정의하여 간단하게 내용을 확인
		return null;
	}

	public boolean equals(Object obj) {
		return true;
	}
}