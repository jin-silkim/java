package java1;

public class Double2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*응용문제5. (do-while문)
		 다음과 같이 합계를 출력하는 loop문을 작성하시오.
		 예시)
		 5+5= 10
		 5+4= 9
		 5+3= 8
		 ....
		 2 + 1 = 3
		 Do while문 으로 작성할 것
		 */
		
		
	/*응용문제 6.
	  구구단 9단 중 9*64까지 숫자 중 결과값이
 	 홀수값에 대한 평균값 결과를 출력 하시오.	 */
	
	/*응용문제 7.
	
	 사용자가 숫자 3개를 입력, 3개의 숫자 중 짝수의 대한 숫자만 곱하여 결과값을 출력함
	 단, 짝수의 숫자가 한개 또는 없을 경우 "짝수의 숫자가 확인 되지 않습니다." 라는 메세지를 출력
	  
	 */
		
	Scanner sc = new Scanner(System.in);
	int w=1;
	while(w < 4){
		System.out.println("숫자를 입력하세요:");
		int a = sc.netxInt();
		//System.out.printIn(a);
		w++;
	}