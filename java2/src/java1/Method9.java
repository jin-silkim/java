package java1;

public class Method9 {

	
	private String name = null;
	private String subject = null;
	private String score = null;
	public static void main(String[] args) {
		String user[][]= {
				{"홍길동","이순신","유관순","강감찬","장보고"}, 
				{"80","77","92","67","100"},//국어
				{"40","100","80","92","67"},//수학
				{"95","80","42","98","50"},//과학
				{"40","92","100","95","30"}//역사
				
		};
		
		int ea = user[0].length;
		int w = 0;
		while(w < ea) {
			System.out.println(user[w][0]);
			w++;
	}

