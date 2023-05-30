package prac;
import java.util.*;
public class fd {

	public static void main(String[] args) {
		System.out.print("1부터 100중 숫자하나를 입력해주세요. :");
		Scanner scanner = new Scanner(System.in);
		int user = scanner.nextInt();
		int com = (int)Math.random()*100;
		
		System.out.println("당신은"+ user +"입니다");
		System.out.println("컴은"+ com+ "입니다");
		
		if(user-com>0) {
			System.out.println("더 큰 수를 선택해 당신이 이겼습니다.");
		} else if(user-com==0) {
			System.out.println("같은 수를 선택하였습니다.");
		} else {
			System.out.println("더 작은 수를 선택해 당신이 졌습니다.");
		}
	}

}
