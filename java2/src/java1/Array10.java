package java1;

import java.util.Arrays;

public class Array10 {

	//2차배열 응용편
	
	public static void main(String[] args) {
		/*
		 응용문제 7
		 Adata와 Bdata 두가지 배열값을 더한 후
		 해당 배열값을 기준으로 짝수, 홀수인지를 나열하는 배열 결과를 출력하는
		 코드를 작성하시오.
		 
		 Adata[0] = 5 17 19 22 35
		 Adata[1] = 1 2 3 4 5
		 Result =["짝수", "홀수", "짝수","짝수","짝수"]	  
		*/
		
		
		// TODO Auto-generated method stub
		int data[][] = {
				{1, 2, 3},
				{3, 4, 5}
		};
		//
		
		int indata[][] = new int[1][5];
		
		indata[0][0] = 10;
		indata[0][1] = 20;
		indata[0][2] = 30;
		indata[0][3] = 40;
		indata[0][4] = 50;
		
		System.out.println(Arrays.toString(indata[0]));

		}
	
	
	/*int number = sc.nextInt();
	int money = 0;
	switch(number) {
	case 1:
		money = 60000;
	break;
	case 2:
		money = 125000;
	break;
	case 3:
		money = 10000;
	break;
	}
	System.out.printf("%d 선택 가격은: %d 원", number, money);
	System.out.println("30% 할인 쿠폰을 적용하시겠습니까? (y/n)")
	String*/ 
	
	
	}
