package ex03operator;

public class E05ShortCiruitEvaluation {
	
	/*
	 SEC(Short-Ciruit-Evaluation)
	 	하나의 조건검사마능로 결과를 알수 있는 경우 Java컴파일러는
	 	뒤의 조건을 수행하지 않고 건너뛰게 된다. 이 경우 변수의
	 	값이 변경되는 코드가 있다면 실행되지 않으므로 주의해야 한다.
	 */

	public static void main(String[] args) {
		
		int num1=0, num2=0;
		boolean result;
		
		/*
		 &&(논1리 And)의 경우 둘중 하나만 false이면 false를 반환하므로
		 첫번째 조건이 false이면 두번째 조건을 검사(수행)하지 않는다.
		 */
		result = (num1+=10)<0 &&(num2+=10)>0;
		System.out.println("reseult="+result);
		System.out.println("num="+num1+", num2="+ num2);
		/*
		 ||(논리OR)의 경우 둘중 하나만 true이면true를 반환하므로 
		 첫번째 조건이 true이면 두번째 조건을 검사하지 않는다.
		 */
		result = (num1+=10)>0 ||(num2+=10)>0;
		System.out.println("reseult="+result);
		System.out.println("num="+num1+", num2="+ num2);
		
		
		/*
		 따라라서 num2의 결과가 프로그램에 영향을 미치게되는 경우라면
		 별도의 처리를 해야하고 코드작성에 주의해아 한다.
		 */
		
	}

}
