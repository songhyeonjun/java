package fourth_project;

import java.time.LocalDate;
import java.time.LocalTime;

public class Date {

	public static void main(String[] args) {
		LocalDate localdate = LocalDate.now();
		System.out.println("��:"+localdate.getYear());
		//System.out.println("��:"+localdate.getMonth());
		System.out.println("��:"+localdate.getMonthValue());
		System.out.println("��:"+localdate.getDayOfMonth());
		System.out.println("����:"+localdate.getDayOfWeek());
		
		LocalDate localdate2 = LocalDate.of(2022, 1, 24);
		System.out.println("��:"+localdate2.getYear());
		//System.out.println("��:"+localdate2.getMonth());
		System.out.println("��:"+localdate2.getMonthValue());
		System.out.println("��:"+localdate2.getDayOfMonth());
		System.out.println("����:"+localdate2.getDayOfWeek());
		
		LocalTime time = LocalTime.now();
		System.out.println(time.getHour()+"��");
		System.out.println(time.getMinute()+"��");
		System.out.println(time.getSecond()+"��");
	}

}
