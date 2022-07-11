package if_;

public class Ex1 {

	public static void main(String[] args) {
		
		//정수 num이 5보다 크다 or 5보다 작다  or 5와 같다 판별
		int num =3;
		
		if(num>5) {
			System.out.println("num이 5보다 크다");
		}else if (num < 5){
			System.out.println("num이 5보다 작다");
		}else {
			System.out.println("num이 5와 같다");
		}
	}

}
