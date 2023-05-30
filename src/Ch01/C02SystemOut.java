package Ch01;

public class C02SystemOut {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 단축키
		// 복사 : ctrl + alt 방향키 아래
		// 주석 : ctrl + /
		
		//System : OS
		//System.out : OS가 관리하는 표준 출력 스티립\
		
		//System.out.print()
		//ESCAPE 문자 :
		// \n : 개행, 줄바꿈
		// \b : 백스페이스
		// \t : 탭길이(기본 8칸) 만큼 커서이동
		
		System.out.print("Hello World\n");
		System.out.print("Hello World\n");
		System.out.print("Hello World\n");
		System.out.print("He\tlloWorld\n");
		
		// System.out.printf()
		// format : 형식, 서식
		// %d : 10진수 정수 서식문자
		// %f : 10진수 상식 서식문자
		// %c : 한 문자 서식문자
		// %s : 문자열 서식문자
		
		System.out.printf("%d %d %d\n", 10,20,30);
		System.out.printf("%f %f %f\n", 10.1,20.1,30.1);
		System.out.printf("%c %c %c\n", 'A','B','C');
		System.out.printf("%s %s %s\n", "This is","String","Test");
		System.out.printf("%d %s : %d\n", 1,"국어",100);
		
		//System.out.println()
		System.out.println("hello World");
		System.out.println("hello World");
		System.out.println("hello World");
		System.out.println("hello World");
		
		
		
		
	}

}
