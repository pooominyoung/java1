package Ch02;

public class C04자료형 {

	public static void main(String[] args) {
//		//정수 int-4byte 정수 부호
//		
//		int n1 = 0b10101101;
//		int n2 = 173;
//		int n3 = 0255;
//		int n4 = 0xad;
//		System.out.printf("%d %d %d %d\n", n1,n2,n3,n4);
//		
//		//정수 byte -1byte 정수 부호
//		
//		System.out.println("---------------------");
//		byte n5 = -128;
//		byte n6 = -30;
//		byte n7 = 30;
//		byte n8 = 127;
//		byte n9 = (byte)129;
//		System.out.printf("%d\n",n5);
//		

		// 정수 short-2byte 정수 | char-2byte정수 부호 x
//		
//		char n1 = 65535; //(0~65535)
//		short n2 = 32767; // (-2^15 ~ +2^15-1)(-32768 ~ +32767)
//		
//		char n3 = 60000;
//		short n4 = n3; //문제발생 왜? 같은 크기라도 short는 양,음수를 포함한 크기기에 절댓값 크기 자체는 적다
//		
//		System.out.printf("%d\n",n4);
//		

//		// 정수 long 8byte 정수 부호 o
//
//		long n1 = 10;
//		long n2 = 20L; // L,l 리터럴 접미사 : long 자료형 사용하며 값 저장
//
//		long n3 = 10000000000; // 문제발생 왜?
//		long n4 = 10000000000L; // int가 아닌 long에 넣겠다는 뜻
//		
//		
//		// 실수
		//유리수와 무리수 통칭
		//소숫점 이하값을 가지는 수 
		//float : 4byte 실수 (6~9자리)
		//double : 8byte 실수 (15~18자리), 기본자료형	
//		
//		//정밀도 확인
////		float n1 = 0.123456789123456789F; //f,F: float형 접미사
////		double n2 = 0.123456789123456789;
//		
		
		//단일문자 char 2byte 정수
		
//		char ch1 ='a';
//		System.out.println(ch1);
//		System.out.println((int)ch1); // 011000001
//		
//		char ch2 = 98;
//		System.out.println(ch2);
//		System.out.println((int)ch2); // 011000010
//		
//		char ch3 = 'b'+1;
//		System.out.println(ch3);
//		System.out.println((int)ch3); // 011000011
//		
//		char ch4 = 'c'+2;
//		System.out.println((char)ch4); 
//		System.out.println(ch4); // 011000011
////		
//		char ch5 = 0xac00;
//		System.out.println(ch5);
//		char ch6 = 0xac00+1;
//		System.out.printf("%c %c\n", ch5,ch6);
//		
//		System.out.printf("%c\n",'\uAC80');
//		
//		char n = 10;
//		
//		System.out.printf("TEST: %c\n",'\ud7fb');

		//문자열 : string (클래스 자료형)
//		//기본자료형(원시타입)
//		byte n1;
//		short n2;
//		double n3;
//		long n4;
		
		//클래스 자료형 . 클래스 자료형으로 만든 벼수는 '참조변수'라고 하고 참조변수는 데이터가 지정된 위치정보(메모리 주소 값)에 저장된다.
		
//		int n1 = 10;
//		String name = "홍길동";
//		String job = "프로그래머";
//		System.out.println(name);
//		System.out.println(job);
		
		//boolean : 논리형 (true / false 저장)
		
		boolean flag = 10>5;
		if(flag)
		{
			System.out.println("참인 경우 실행");
		}
		else
		{
			System.out.println("거짓인 경우 실행");
		}
	}

}
