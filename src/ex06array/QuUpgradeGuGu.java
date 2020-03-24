package ex06array;
/*
 아래와 같은 출력결과를 보이는 업그레이드 구구단 프로그램을 작성하시오.
Class Name : QuUpgradeGuGu.java
---------- java ----------
2 x 1 = 2
2 X 2 = 4
2 X 2 X 2 = 8
2 X 2 X 2 X 2 = 16
2 X 2 X 2 X 2 X 2 = 32
2 X 2 X 2 X 2 X 2 X 2 = 64
2 X 2 X 2 X 2 X 2 X 2 X 2 = 128
2 X 2 X 2 X 2 X 2 X 2 X 2 X 2 = 256
2 X 2 X 2 X 2 X 2 X 2 X 2 X 2 X 2 = 512
3 X 1 = 3
3 X 3 = 9
3 X 3 X 3= 27
………중간 생략………
9 X 9 X 9 X 9 X 9 X 9 X 9 X 9 = 43046721
9 X 9 X 9 X 9 X 9 X 9 X 9 X 9 X 9 = 387420489
출력 완료 (0초 경과) - 정상 종료
 */

public class QuUpgradeGuGu {

	public static void main(String[] args) {

		
		int i=1;
		while(i<=9) {
			int j=1;
			while(j<=9) {
				if(i>=j) {
					//j는 i의 갯수만큼만 출력한다.
					System.out.print("X %d");
				}
				j++;
			}
			System.out.println();//*5개 찍고 줄바꿈
			i++;
		}
	}

}
//		for(int x=2;x<=9;x++) {
//			for(int y=2;y<=9;y++) {
//				for(int z=y;z<=9;z++) {
//				
//				int result = x*y*z;
//				System.out.printf(" %d X %d = %d",x,y,result);
//			}
//			System.out.println();
//		}
//		
//	}
//
//}

