package java2;

import java.util.Arrays;

public class List2 {
	//kim이 사용자 외에 나머지 사용자를 출력
	public static void main(String[] args) {
/psexcec
		String user[] = {"hong","kim","park","jang"};
		ArrayList<String> al = new ArrayList<>{Arrays.asList(user)};
		int ea = al.size();
		int w = 0;
		while(w<ea) {
			ea = a1.size();
			if(al.get(w).equals("kim")) {
				al.remove(w);//remove시 실제 배열번호가 변경됨
			}
			w++;
		}
		System.out.println(al);
		/*응용문제
		 
		 해당 배열을 확인 후 짝수의 숫자를 모두 삭제하여
		 최종 결과 배열을 출력 하시오.
		 10 7 6 1 11 37 41 22
		 
		 결과 7 1 11 37 41	  
		  */
		
		/*[] % 0, */
		
		int ww= 0;
		while(ww < ar.size()){
			if(ar.get(ww) % 2 == 0) {
				ar.remove(ww);
			}
			ww++;
		}
		//Collection.sort(ar);//오름차순으로 실행
		/*Collections.sortin(ar,Collection.revereOrder());
		System.out.println(ar);*/

