package java3;

import java.util.ArrayList;
import java.util.Scanner;

public interface List4 {

	//무한루프
	public static void main(String[] arge) {
		//for(;){}/
		Scanner sc = new Scanner(System.in);
		int no = 0; // 
		//반배열
		ArrayList<Integer> al = new ArrayList<>();
		while(true) {
			System.out.println("숫자를 입력해 주세요?");
			no = sc.nextInt();
			al.add(no);
			int ea = al.size();
			if(ea > 10) {
				
				break;
			}
		}
		System.out.println(al);
		sc.close();
		
		
		
		
	}
	
	
}
