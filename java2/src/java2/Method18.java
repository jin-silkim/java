package java2;

public class Method18  extends Method17{ //17연계확장

//Main은 오버라이딩을 사용x
	
	public static void main(String[] args) {
		
		Method17 m = new Method17();
		m.main(args);
	}

}
class data{
	
}

//main class에서는 main class 상속 못함
//경로가 다른 외부 class를 실행하고자 하는 파일에서 상속할 수 있음
//Main