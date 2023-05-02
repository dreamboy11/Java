package sec01.exam01_variable;

public class LiteralExample {
	public static void main(String[] args) {
		
		/* 정수 리터럴 */
		
		// 10진수
		int var1 = 10;
		System.out.println(var1);
		
		// 8진수
		int var2 = 010;
		System.out.println(var2);
		
		// 16진수
		int var3 = 0x10;
		System.out.println(var3);
		
		/* 실수 리터럴 */
		
		// 소수점이 있는 리터럴
		double var4 = 0.25;
		System.out.println(var4);
		
		// 대문자 E 또는 소문자 e가 있는 리터럴
		double var5 = 2E5;
		System.out.println(var5);
		
		/* 문자 리터럴 */
		
		// 작은 따옴표로 묶은 리터럴
		char var6 = 'A';
		System.out.println(var6);
		
		char var7 = '한';
		System.out.println(var7);
		
		// 이스케이프가 붙은 문자 리터럴
		System.out.println('\t' + "들여쓰기");
		System.out.println("대한" + '\n' + "민국");
		System.out.println();
		System.out.println("대한" + '\r' + "민국");
		System.out.println();
		System.out.println("This" + '\'' + "s Java");
		System.out.println();
		System.out.println
		("이것은 " + '\"' + "중요" + '\"' + " 합니다");
		System.out.println();
		System.out.println
		("가격이 " + '\\' + " 300입니다");
		
		System.out.println();
		
		char var8 = '\u0041';
		System.out.println(var8);
	}

}
