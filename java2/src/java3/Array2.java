package java3;

import java.util.ArrayList;

public class Array2 {

	public static void main(String[] args) {
		//ArrayList , List , LinkedList - 2차배열
		String data[][] = {
				{"hong","kim","park"},
				{"서울","강원","경기"}
		
		};
		//String[] : 2차배열 이상 Integer[] : 숫자로된 2차배열
		ArrayList<String[]> ar = new ArrayList<String[]>(Array.asList(data));
		int ea = ar.size();
		System.out.println(ea);//배열 그룹 개수
		System.out.println(ar.get(0).length); //첫 번째 배열에 데이터 개수
		
		int w = 0;
		while(w < ar.get(0).length) {
			System.out.println(ar.get(0)[w]);
		}
		
		
	}
}
