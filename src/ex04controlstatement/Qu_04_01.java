package ex04controlstatement;

/*
문제1) 파일명 : Qu_04_01.java
하나의 문자를 입력받아 사용자가 입력한 값이 숫자인지 판단하여 숫자라면 2의배가 아닙니수인지를 다시 판단하여서 2의배수인 경우에만 "2의 배수 입니다"라고 출력하여라.
그 외에는 "2의 배수다" 라고 출력한다.
힌트] '0'의 아스키코드값은 48 입니다. 
(System.in.read()를 사용하세요)
 */
import java.io.IOException;
import java.util.Scanner;

public class Qu_04_01 {

	public static void main(String[] args) throws IOException {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("하나의 문자룰 입력해주세요 : ");
		int number = System.in.read();
		
		if (48 <= number && 57 >= number) {
			if(!(number==48)&&(number % 2 == 0)) {
				System.out.println("2의 배수 입니다.");
			}
			else {
				System.out.println("2의 배수가 아니거나, 두자리 수입니다.");
			}
		}
		else {
			System.out.println("숫자를 입력해주세요~");
		}
	}
}

