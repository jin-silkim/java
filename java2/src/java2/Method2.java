package java2;

import java.util.Scanner;

public class Method2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class box1{
	protected String user;
	public void ask() {
		Scanner sc = new Scanner(System.in);
		System.out.println("고객명을 입력하세요:");
		this.user = sc.next();
	}
	public void search(String nm) {
		
	}
	//@override 상속
}

