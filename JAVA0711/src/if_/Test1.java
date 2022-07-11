package if_;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		//양수 음수 0 판별
		int num1=0;
		
		if(num1>0) {
			System.out.println("양수입니다");
		}else if(num1<0) {
			System.out.println("음수입니다");
		}else {
			System.out.println("0입니다");
		}
		
		
		//=======================================
		//홀수 짝수 0 판별
		int num2 =0;
		
		if (num2==0) {
			System.out.println("0입니다");
		}else if( num2%2 !=0) {
			System.out.println("홀수입니다");
		}else {
			System.out.println("짝수입니다");
		}
		
		
		//=======================================
		//대문자 -> 소문자 , 소문자 -> 대문자
		char ch = 'ㅇ';
		
		if('A'<=ch && ch<='Z') {
			System.out.println(ch+=32);
		}else if('a'<=ch && ch<='z') {
			System.out.println(ch-=32);
		}else {
			System.out.println("ch는 영문자가 아닙니다!");
		}

		//이거보다 좀 더 좋은 코드
		char ch1 = 'a';
		String result=" ";
		if('A'<=ch1 && ch1<='Z') {
			result = "ch1 = " + (ch1 +=32);
		}else if('a'<=ch1 && ch1<='z') {
			result = "ch1 = " + (ch1-=32);
		}else {
			System.out.println("ch는 영문자가 아닙니다");
		}
		System.out.println(result);
		
		
		//=======================================
		//학생 점수 score에 대한 학점 grade 판별
		int score = 89;
		String grade = " ";
		
		if(score >=90) { // && score <=100 이거는 필요 없음
			grade = "A학점";
		}else if(score >=80) {
			grade = "B학점";
		}else if(score >=70) {
			grade = "C학점";
		}else if(score >=60) {
			grade = "D학점";
		}else {
			grade = "F학점";
		}
		
		System.out.println(grade);
	
		//=======================================
		//학생 점수 score에 대한 학점 grade 판별
//		int score1 = 89;
		Scanner sc = new Scanner(System.in);
		int score1 = sc.nextInt();
		String grade1 = " ";
		
		grade1 = score1 >= 90 ? "A":
				 score1 >= 80 ? "B":
				 score1 >= 80 ? "C":
				 score1 >= 80 ? "D":"F";
		
		grade1 += "학점";
		System.out.println(grade1);

		
		
	}

}
