package day02;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		final String KOREA="���ѹα�";
		System.out.println(KOREA);
		//String from="�ɳ���";
		//System.out.println(korea);
		
		/*Scanner scan =new Scanner(System.in);
		System.out.println("�̸� �Է�: ");
		String name=scan.next();
		int age;
		System.out.println("���� �Է�: ");
		age=scan.nextInt();
		
		System.out.println(name+"���� ���̴� "+age+"�� �Դϴ�.");
		*/
		System.out.println("=======================");
		Scanner scan =new Scanner(System.in);
		System.out.println("����� �̸��� �����Դϱ�?");
		String name=scan.next();
		System.out.println("=======================");
		int ko;
		System.out.println(name+"���� ���� ����: ");
		ko=scan.nextInt();
		int eng;
		System.out.println(name+"���� ���� ����: ");
		eng=scan.nextInt();
		int math;
		System.out.println(name+"���� ���� ����: ");
		math=scan.nextInt();
		System.out.println("=======================");
		
		System.out.println("�հ�:"+(ko+eng+math));
		System.out.println("=======================");
	
		
		
		
		
		
		

	}

}
