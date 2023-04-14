package java1;

public class Class1 {
//class만 단독으로 사용 
	//필드공간 (전역변수, 전역 객체)
	//static : 메모리를 직접적으로 핸들링하는 속성
	
	public static void main(String[] args) {//main 실행 메소드 
		// TODO Auto-generated method stub
		Adata ad = new Adata();//해당 클래스를 객체로 변환
		Bdata bd = new Bdata();
		System.out.println(ad.a);
		System.out.println(bd.b);
		Cdata cd = new Cdata();
		cd.aa = 10;// Cdata
		System.out.println(cd.aa);
	}

}

class Adata{
	String a = "홍길동";
}
class Bdata{
	String b = "이순신";
}
class Cdata{
	int aa;
}

	
