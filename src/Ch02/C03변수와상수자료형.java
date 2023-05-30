package Ch02;

public class C03변수와상수자료형 {

	public static void main(String[] args) {
		
		//수 : 선 저장 / 후 처리
		//변수 : 개발자의 유지보수 측면에서 바뀔 가능성이 큰 수
		//변수명 : 저장되어져 있는 변수 공간에 접근하기 위한 문자형태의 주소
		//자료형 : 데이터(수) 저장을 위한 공간을 형성하는 예약어 + 제약조건
		
		//상수 : 항상 같은 수 즉, 고정값
		
		//대입연산자 (=)
		//lv(공간) = rv(값 - 먼저 처리. 즉 먼저 저장을 한다는 뜻)
		
		
		int num1; //정수형 4byte 변수 num1 정의
		num1 = 10; // 10상수 값을 num1공간에 대입
		int num2 = 4; // 4상수 값을 4byte 정수 num2 공간에 초기화
		int num3 = num1 + num2;
		// num1의 값과 num2값의 합을 4byte 정수 num3 공간에 초기화
		System.out.println(num3); // num3 값을 콘솔창에 출력
	}

}
