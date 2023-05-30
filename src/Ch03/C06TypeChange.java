package Ch03;

public class C06TypeChange {

	public static void main(String[] args) {
		//short vs char
		//char 와 short는 같은 사이즈를 (2byte) 가지나, 
		//short는 음수와 양수를 지원하고 char는 양수만 지원
		//때문에, short와 char간 데이터 교환 시 동일한 값을 저장하더라도 
		//표현하는 범위가 다르기 때문에 각각 다른 값이 나올 수도 있다.
		
		char n1 = 60000;
//		short n2 = n1; //1차적으로 자료형이 다르다는 문제가 발생
		short n2 = (short)n1; // 데이터 손실이 발생
		System.out.println(n2);
		
		char n3 = (char)n2;
		System.out.println((int)n3);
		
		
	}

}
