package sec04.exam07_conditional;

public class ConditionalOperationExample {
	public static void main(String[] args) {
		System.out.println("삼항 연산자");
		System.out.println();
		
		int score = 85;
		
		char grade = (score > 90) ? 'A' :
		((score > 80) ? 'B' : 'C');
		System.out.println
		(score + "점은 " + grade + "등급입니다.");

	}

}
