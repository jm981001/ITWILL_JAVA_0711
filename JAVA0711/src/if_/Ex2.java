package if_;


public class Ex2 {

	public static void main(String[] args) {
	
		int score = -3;
		String grade = " ";
		
		if(0<=score && score <=100) { //정상범위
			
			if(score >=90) { 
				grade = "A학점";
			}else if(score >= 80) {
				grade = "B학점";
			}else if(score >= 70) {
				grade = "C학점";
			}else if(score >= 60) {
				grade = "D학점";
			}else {
				grade = "F학점";
			}
			
		}else{
			grade = "점수 입력 오류!";
		}
		System.out.println(grade);
		
	}

}
