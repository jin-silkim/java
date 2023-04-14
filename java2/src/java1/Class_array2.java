package java1;

public class Class_array2 {
	//2개의 배열 값
	
	/*
	 응용문제2.
	 "검색하고자 하는 이름을 적어주세요?" 출력하게 됩니다.
	 검색어에 이순신이라고 검색을 하게 되면, "이순신님은 80점 입니다." 라고 출력되도록 합니다.
	 단, scoring에  해당 배열에 있는 데이터를 검색하는 용도로 사용되도록 하시오 
	  */
	
	public static void main(String[] args) {
		String a1[] = {"홍길동","이순신","강감찬","유관순","김유신"};
		String a2[] = {"100", "80","39","42","55"};
		
		
		
		// TODO Auto-generated method stub

		System.out.println("검색하고자 하는 이름을 적어주세요");
		
		
		int name = a1.length;
		int scoree = a2.length;
		//System.out.print(name[1]);
		//System.out.println(name[0]);

		
		/*응용문제 배열데이터를 모두 합한  결과값을 출력하시오.
		  15 60 11 17 24 => 127
		 */
		
		int data[] = {15,16,11,14,27}
		//for in
		for(int f : data) {
			System.out.println(f);
		}
		System.out.println(sum);
		
		String id[] = {"hong","kim","park","lee","jung"};
		/*응용문제 아이디 데이터 중 4글자 이상의 아이디를 출력*/ 
		/*응용문제 "주문하고자 하는 음식을 선택해 주세요?"
		 사용자가 원하는 음식을 선택합니다.
		 선택된 음식 리스트를 출력하십시오.
		 단, 주문정보를 선택했을 경우만 주문자의 음식 리스트가 나와야 함
		 메뉴 : 햄버거, 피자, 치킨, 라면, 김밥, 커피
		 
		 출력예시)
		 1. 햄버거 2.피자 3.치킨 4.라면 5.김밥 6.커피 7.주문정보
		 [치킨, 라면, 햄버거, null, null]
		 */
		
	/* Scanner sc = new Scanner(System.in); 최소
		int w=1;
		while(w < ){ //
			System.out.println("숫자를 입력하세요:");
			int ? = sc.netxInt();
			//System.out.printIn(a);
			
		 if(selelct= 0)
			w++; */
		
		
		
		
		