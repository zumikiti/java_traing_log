package kadai_lesson6;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

public class WeekdayOrWeekend {

	public static void main(String[] args) {
		
		// Calendarでの実装
		Date date = new Date();
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		int cal_week = cal.get(Calendar.DAY_OF_WEEK);
		
		System.out.println("Calendarでの実装");
		if(cal_week == Calendar.SATURDAY || cal_week == Calendar.SUNDAY){
			System.out.println("今日はおやすみです。");
		} else {
			System.out.println("お仕事頑張りましょう。");
		}
		
		
		// LocalDateTimeでの実装
		LocalDateTime ldt = LocalDateTime.now();
		DayOfWeek dow = ldt.getDayOfWeek();
		
		System.out.println("LocalDateTimeでの実装");
		if(dow == DayOfWeek.SATURDAY || dow == DayOfWeek.SUNDAY){
			System.out.println("今日はおやすみです。");
		} else {
			System.out.println("お仕事頑張りましょう。");
		}
	}
}
