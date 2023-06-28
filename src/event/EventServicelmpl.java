package event;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class EventServicelmpl implements EventService{
	public ArrayList<String> arr = new ArrayList<>();
	SimpleDateFormat simple = new SimpleDateFormat("MM월");
	public void getevent() {
		arr.add("설날 세일");
		arr.add("눈 축제");
		arr.add("벚꽃 축제");
		arr.add("놀이공원 할인");
		arr.add("케이크 할인");
		arr.add("튤립 축제");
		arr.add("불꽃축제");
		arr.add("워터파크 할인");
		arr.add("추석 행사");
		arr.add("할로윈 행사");
		arr.add("빼빼로 행사");
		arr.add("크리스마스 행사");
	}
	public void eventNow() {
		long today = System.currentTimeMillis();
		String mon = (String)simple.format(today);
		String intStr = mon.replaceAll("[^\\d]", "");
		int num = Integer.parseInt(intStr);
		System.out.println(arr.get(num-1));
	}
	public void eventAll() {
		for(int i=0;i<12;i++) {
			System.out.println((i+1)+". "+arr.get(i));
		}
	}
}
