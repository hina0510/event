package main;

import java.util.Scanner;

import event.EventServicelmpl;
import member.MemberServicelmpl;

public class MainClass {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	EventServicelmpl ev = new EventServicelmpl();
	MemberServicelmpl mem = new MemberServicelmpl();
	int num, num2, num3;
	while(true) {
		System.out.println("==================");
		System.out.println("1. 회원 이동");
		System.out.println("2. 이벤트 이동");
		System.out.println("==================");
		System.out.print(">>>");
		num=input.nextInt();
		switch (num) {
		case 1: 
			while(true) {
				System.out.println("==================");
				System.out.println("1. 회원 저장");
				System.out.println("2. 회원 보기");
				System.out.println("3. 나가기");
				System.out.print(">>>");
				num2=input.nextInt();
				if(num2==1) {
					mem.getMember();
				}else if(num2==2) {
					mem.setMember();
				}else if(num2==3) {
					break;
				}else {
					System.out.println("잘못 입력");
				}
			}
			break;
		case 2: 
			while(true) {
				System.out.println("==================");
				System.out.println("1. 이달의 이벤트 보기");
				System.out.println("2. 전체 이벤트 보기");
				System.out.println("3. 나가기");
				System.out.print(">>>");
				num3=input.nextInt();
				if(num3==1) {
					ev.getevent();
					ev.eventNow();
				}else if(num3==2) {
					ev.getevent();
					ev.eventAll();
				}else if(num3==3) {
					break;
				}else {
					System.out.println("잘못 입력");
				}
			}
			break;
	}
}
}
}
