package Exame;

import java.util.*;

import Exame9.Strings;

public class Example7 {

	public static void main(String[] args) {
		/*응용문제
		 
		 사용자가 총 7개의 숫자를 입력합니다.
		 7개의 숫자 중 짝수 값이 몇 개의 입력 되어있는지 출력하시오. 또한 최종 배열 값을 출력합니다.
		 Integer로 배열로 하시오
		 * */
	
		String menus[][] = {
				{"OO배송","OO프레시","OO택배","OO박스","이벤트","설날","크리스마스"},
				{"Y","Y","Y","Y","N","N","N"}
		};
		public static void main(String[] args) {
			Example8 ex = new Example8();
			ex.result();
	}
	public void result() {
		//System.out.println(Arrays.toString(this.menus[0]));
		int ea = this.menus[0].length;
		int w = 0;
		while(w < ea) {
			if(this.menus[1][w].equals("Y")) {
				System.out.println("?")
			}
		}
			
}
