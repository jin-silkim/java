package Exame;

import java2.mssql; //외부 클래스 로드


public class exampe {

	public static void main(String[] args) {
		mssql ms = new mssqul();
		ms.abc(); //외부 메소드 로드
		//외부 메소드 메인 로드(외부 java 파일 가져오ㄹ 시 main은 로드 하지 않음)
		String result = ms.bbb();
		System.out.println("외부 클래스 로드 완료");

	}

}
