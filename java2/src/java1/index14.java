package java1;

public class index14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int money = 10000;
		int coupon = 20;
		double a = coupon * 0.01;
		double b = money * 0.01;
		double c = money - b;
		
		int total = (int)Math.round(c);//ㅡmath 확인하기
		
		//한줄 라인트로 표현
		//double sum = money-(money*(coupon * 0.01));
		System.out.println(total);
		
		/*응용문제 4.
		 * 총 상품금액이 50000원 입니다.
		  사용자에게 "할인 쿠폰을 얼마를 적용할까요?" 라는 질문과 함께
		  숫자를 받습니다. 결과값으로 사용자가 적용한 할인을 최종 상품금액으로 출력하시오.
		  예시)
		  총 상품금액이 5000 입니다.
		  할인 쿠폰을 얼마를 적용할까요?
		  20
		  최종 상품금액은 40000원 입니다.
		 */	
		}
}
