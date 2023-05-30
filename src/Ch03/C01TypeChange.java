package Ch03;

public class C01TypeChange {

	public static void main(String[] args) {
		//(자료)형변환
		//연산시 일치하지 않는 자료형을 일치시키는 작업
		
		//자동형변환(암시적 형변환) : 컴파일러에 의해 자동으로 형변환
		//강제형변환(명시적 형변환): 프로그래머에 의해 강제로 형변환
		
		//자동형변환(=)
		//범위가 넓은 공간에 작은 값이 대입되는 경우
		//byte > short,char > int > long > float > double
		//float에 long값을 담는건 문제없음 정수공간에 있는 값을 실수 공간에 담는 것은 문제가 없기 때문
		
		byte byteValue = 10;
		int intValue = byteValue;
		System.out.println("intValue" + intValue);
		
		char charValue = '가';
		intValue = charValue;
		System.out.println("가 의 유니코드 :" + intValue);
		
		intValue = 50;
		long longValue = intValue;
		System.out.println("longValue : " + longValue);
		
		longValue = 100;
		float floatValue = longValue;
		System.out.println("floatValue :" + floatValue);
		
		floatValue = 100.5F;
		double doubleValue = floatValue;
		System.out.println("doubleValue:" +doubleValue);
		

	}

}
