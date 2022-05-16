package day02;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		
		
		Scanner scan =new Scanner(System.in);
		System.out.println("숫자 하나를 입력하시오: ");
		int num=scan.nextInt();
		
		if(num%2==1) {
			System.out.println("홀수입니다");
			
		}else {
			System.out.println("짝수 입니다.");
		}
		

	}

}
