package if_;

public class Test2 {

	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 5;
		String r = " ";
		
		if(num1%2==0) { // num1은 일단 짝수
			if(num2%2 == 0) { //n2가 짝수
				r = "짝수 + 짝수 = 짝수";
			}else if(num2%2 != 0) { //n2가 홀수
				r = "짝수 + 홀수 = 홀수";
			}
		}else {// num2은 일단 짝수
			if(num2%2 == 0) {
				r = "홀수 + 짝수 = 홀수";
			}else if(num2%2 != 0) {
				r = "홀수 + 홀수 = 짝수";
			}
		}
		System.out.println(r);
		
		
		
		
		
		
		
		
	}

}
