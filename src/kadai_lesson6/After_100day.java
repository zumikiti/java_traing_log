package kadai_lesson6;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class After_100day {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		
		System.out.println("DateとCalendarで実装");
		Date date = new Date();
		String now = sdf.format(date);
		System.out.println("本日は" + now);
		
		//Calendar
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.DAY_OF_YEAR, 100);
		Date after100 = cal.getTime();
		String str =sdf.format(after100);
		System.out.println("100日後は" + str);
		
		System.out.println("LocalDateで実装");
		//LocalDate
		LocalDate ldt = LocalDate.now();
		System.out.println("本日は" + ldt);
		LocalDate ldt100 = ldt.plusDays(100);
		System.out.println("100日後は" + ldt100);
	}

}
