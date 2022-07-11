package switch_case;

public class Test1 {
	public static void main(String[] args) {

		int score = 77 ; 
		String grade = " ";
		if (0 <= score && score <= 100)
			switch (score/10) { //앞자리만 구하는 방법 
			case 10:	
			case 9:		grade = "A학점"; break;
			case 8:		grade = "B학점"; break;
			case 7:		grade = "C학점"; break;
			case 6:		grade = "D학점"; break;
			default:	grade = "F학점"; break;

			}else {
				grade = "점수 입력 오류";
			}

		System.out.println(grade);
		System.out.println("=================================");

		//해당 등급에 따른 할인 금액을 계산
		//-등급  -> 1(일반회원), 2(vip회원), 3(vvip회원)
		//-할인율 -> 일반회원(5%), vip회원(15%), vvip회원(30%)
		//회원 등급이 아닐경우 "회원 등급 오류!" 라고 출력

		//switch문
		int p1 = 100000;
		int grade1 =4;
		String result1 = " ";
		switch (grade1) {
		case 1:
			result1 = "결재 금액 : " + (p1 * 0.95) + "원";
			break;
		case 2:
			result1 = "결재 금액 : " + (p1 * 0.85) + "원";
			break;
		case 3:
			result1 = "결재 금액 : " + (p1 * 0.7) + "원";
			break;
		default:
			result1 = "회원 등급 오류!";
			break;
		}
		
		System.out.println(result1);

		//if문 이용
		int p2 = 100000;
		int grade2 =2;
		String result2 = "결재 금액 : ";
		if(grade2 ==1) {
			result2+= (p2*0.95) + "원";
		}else if(grade2 ==2) {
			result2+= (p2*0.85) + "원";
		}else if(grade2 == 3) {
			result2+= (p2*0.7) + "원";
		}else {
			result2= "회원등급 오류!"; //이건 누적 아닌게 포인트
		}
		System.out.println(result2);


		//삼항연산자
		int p3 = 100000;
		int grade3 =4;
		String result3 = "결재 금액 : ";
		result3  = grade3 == 1 ? "결재 금액 : " + (p3 * 0.95) + "원" 	:
				   grade3 == 2 ? "결재 금액 : " + (p3 * 0.85) + "원" 	:
				   grade3 == 3 ? "결재 금액 : " + (p3 * 0.7)  + "원" 	: "회원 등급 오류!";

		System.out.println(result3);



	}
}
