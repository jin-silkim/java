package java1;

//상속 메소드 (

class box1{
	public String user_id;
	private String user_pw;
	public void list1() {
		this.user_id = "hong";
		return this.user_pw;
	}

//extends : box1을 상속 받아서 box2에서 진행
//상속을 이용할 경우 같은 메소드 이용은 사용하지 않음

	public void list(){
		this.user_id= "hong";
	}
}

class box2 extends box1{
	public void list2() {
		System.out.println(this.user_id);
	}
}

public class Method7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
