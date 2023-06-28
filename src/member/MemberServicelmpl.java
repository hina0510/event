package member;

import java.util.ArrayList;
import java.util.Scanner;

public class MemberServicelmpl implements MemberService{
	Scanner input = new Scanner(System.in);
	String name;
	ArrayList<String> arr = new ArrayList<>();
	
	public void getMember() {
		System.out.print("이름 : ");
		name=input.next();
		arr.add(name);
	}
	public void setMember() {
		System.out.println(arr.size()+"명");
		for(int i=0;i<arr.size();i++) {
			System.out.println((i+1)+". "+arr.get(i));
		}
	}
}
