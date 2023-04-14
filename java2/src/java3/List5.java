package java3;

import java.util.List;

public class List5 {
	//List 배열 사용법
	public static void main(String[] args) {

		
		// List 배열 사용법
		// List(Array 업그레이드) 순서가 있는 데이터 집합 배열과 다르게 빈 배열값을 
		// 메모리 공간의 크기를 동적으로 변경가능 합니다.
		// 메모리 재사용이 편리하다.
		
		String data[] = {"hong", "kim", "park"};
		List<String> a1 = new ArrayList<>(Array.List(data)); 
		System.out.println(a1);
		List<Integer> b1 = new ArrayList<>(1000);
		int w = 0;
		while(w < 10000000) {
			b1.add(w);
			w++;
		}
		System.out.println(b1);
	}

}
