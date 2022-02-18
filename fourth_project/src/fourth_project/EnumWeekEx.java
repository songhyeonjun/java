package fourth_project;

import java.util.Calendar;

public class EnumWeekEx {

	public static void main(String[] args) {
		WeekKOR today = null;
		
		//-------------
		Calendar cal = Calendar.getInstance();
//		int week = cal.get(Calendar.DAY_OF_WEEK);
//		System.out.println("년:"+cal.get(Calendar.YEAR));
//		System.out.println("월:"+(cal.get(Calendar.MONTH)+1));
//		System.out.println("일:"+cal.get(Calendar.DAY_OF_MONTH));
		
		cal.set(Calendar.YEAR, 2022);
		cal.set(Calendar.MONTH, 1-1);
		cal.set(Calendar.DAY_OF_MONTH, 24);
		int week = cal.get(Calendar.DAY_OF_WEEK);
		
		switch(week) {
			case 1:
				today = WeekKOR.일요일; break;
			case 2:
				today = WeekKOR.월요일; break;
			case 3:
				today = WeekKOR.화요일; break;
			case 4:
				today = WeekKOR.수요일; break;
			case 5:
				today = WeekKOR.목요일; break;
			case 6:
				today = WeekKOR.금요일; break;
			case 7:
				today = WeekKOR.토요일; break;
		}
		System.out.println("오늘의 요일:"+today);
	}

}
