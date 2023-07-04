package sec04.exam03_compare;

public class StringEqualsExample {
	public static void main(String[] args) {
		String strVar1 = "이한정";
		String strVar2 = "이한정";
		String strVar3 = new String("이한정");
		
		System.out.println(strVar1 == strVar2);
		System.out.println(strVar1 == strVar3);
		System.out.println();
		System.out.println(strVar1.equals(strVar2));
		System.out.println(strVar1.equals(strVar3));
	}

}
