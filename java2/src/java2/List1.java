package java2;

import java.util.ArrayList;

public class List1 {
	//List 라이브러리
	public static void main(String[] args) {
		
		String memebr[] = {"박소은","윤준승","김여름"};
		//ArrayList : java 라이브러리 배열 메소드 입니다.
		//Arrays.asList : 로드할 배열값을 말합니다.
		//add(추가), get(배열 데이터로드), remove(배열값 삭제), Size(배열 데이터 개수)
		//중요사항 : add 사용시 무조건 맨 뒤에 데이터가 추가됨
		//단, index번호를 적용 할 값을 실행시 해당 index
		
		ArrayList<String> al = new ArrayList<>();
		
		/*al.add("박소은");
		al.add("윤준승");
		al.add("김여름");*/
		
		al.add("심규환");
		al.add("이하늘");
		//System.out.println(al);
		String user = al.get(0);
		System.out.println(user);
		al.remove(4);
		System.out.println(al);
		
	}

}
