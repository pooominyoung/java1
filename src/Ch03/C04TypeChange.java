package Ch03;

public class C04TypeChange {

	public static void main(String[] args) {
		
//		//정수 연산식 (int 보다 작은 변수자료형(short, char, byte))
//		//int로 자동 형변환
//		
//		byte x = 10;
//		byte y = 20;
//		byte result1 = (byte)(x + y);		// 컴파일 에러 x,y는 각각 int형 자료로 담아서 처리가 되기 때문에 x+y는
//											//  byte 보다 큰 int형이라서 에러발생
//											// 왼쪽 byte형으로 저장시 작은 공간에 큰 자료형타입 넣으려하는 것
////		int result1 = x + y;
//		System.out.println(result1);
			
		
		//정수 연산식 (int 보다 큰 변수자료형 (long))
		//큰 타입으로 자동 형 변환
//		byte var1 = 10;
//		int var2 = 100;
//		long var3 = 1000L;
//		int result =(int)(var1 +var2 + var3); 	//오른쪽 변수들은 long 으로 자동 형변환 why? 데이터손실 최소화하기위해
															//but 왼쪽 공간이 작은 공간
		
		
//		long result2 = var1 + var2 + var3;
//		System.out.println(result2);
		
		//실수연산식
		//큰 타입으로 자동 형 변환
		int intvar = 10;
		float flvar = 3.3F;
		double dbvar = 5.5;
		double result3 = intvar + flvar + dbvar; //intvar ,flvar 가 각각 double형으로 
		
		System.out.println(result3);
		
		
		
		
		
		
		
		
		
		
	}

}
