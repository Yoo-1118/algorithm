import java.util.Scanner;

public class AL_CH01_01_EX01 {
	public static void main(String[] args){
		Scanner stdin = new Scanner(System.in);
		
		System.out.println("세 정수의 최댓값을 구합니다.");
		System.out.println("첫번째 정수를 입력하세요");
		int a = stdin.nextInt();
		System.out.println("두번째 정수를 입력하세요");
		int b = stdin.nextInt();
		System.out.println("세번째 정수를 입력하세요");
		int c = stdin.nextInt();
		
		int max = a;
		if(b > a) max = b;
		if(c > a) max = c;
		
		System.out.println("최댓값은" + max + "입니다.");
		
	}
}
