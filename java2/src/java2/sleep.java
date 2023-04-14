package java2;

public class sleep {
	//시간 타이머
	public static void main(String[] args) {
		try {
		int w = 0;
		while(w < 101) {
			
			Thread.sleep(1000);
			System.out.println(w);
			w++;
		}
		}
		catch(Exception e) {

	}

}
