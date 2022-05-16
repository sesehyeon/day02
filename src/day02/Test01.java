package day02;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		final String KOREA="대한민국";
		System.out.println(KOREA);
		//String from="케나다";
		//System.out.println(korea);
		
		/*Scanner scan =new Scanner(System.in);
		System.out.println("이름 입력: ");
		String name=scan.next();
		int age;
		System.out.println("나이 입력: ");
		age=scan.nextInt();
		
		System.out.println(name+"님의 나이는 "+age+"살 입니다.");
		*/
		System.out.println("=======================");
		Scanner scan =new Scanner(System.in);
		System.out.println("당신의 이름은 무엇입니까?");
		String name=scan.next();
		System.out.println("=======================");
		int ko;
		System.out.println(name+"님의 국어 점수: ");
		ko=scan.nextInt();
		int eng;
		System.out.println(name+"님의 영어 점수: ");
		eng=scan.nextInt();
		int math;
		System.out.println(name+"님의 수학 점수: ");
		math=scan.nextInt();
		System.out.println("=======================");
		
		System.out.println("합계:"+(ko+eng+math));
		System.out.println("=======================");
	
		
		
		
		
		
		

	}

}
