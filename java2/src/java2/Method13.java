package java2;

public class Method13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

/*응용문제1. 사용자가 구구단 숫자를 하나 입력,
  ?? 개발자가 입력한 사항을 1~5까지 결과가 출력되는 코드를 작성완료 하시오.
  5*1=5
  ...
  5*9=45
 
 */



class gugudan{

	protected int number;
	public void gugu() {
		Scanner sc = new Scanner(System.in);
		System.out.print("검색할 구구단을 입력하세요");
	}
	
	public void result() {
		int w = 1;
		System.out.println(this.number + "*" + w +"="+this.number*w);
	}
}
