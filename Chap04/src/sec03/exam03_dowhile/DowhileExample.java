package sec03.exam03_dowhile;

import java.util.Scanner;

public class DowhileExample {
	public static void main(String[] args) {
		System.out.println("메시지를 입력하세요.");
		System.out.println
		("프로그램을 종료하려면 q를 입력하세요.");
		System.out.println();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println(scanner);
		String inputString;
		
		do {
			System.out.print(">");
			inputString = scanner.nextLine();
			System.out.println(inputString);
		} while (! inputString.equals("q"));
		
		System.out.println();
		System.out.println("프로그램 종료");
		
	}

}
