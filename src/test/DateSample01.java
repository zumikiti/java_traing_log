package test;

import java.util.Calendar;
import java.util.Date;

public class DateSample01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//現在日時の取得と表示
		Date date = new Date();
		System.out.println(date);
		
		//現在の日時から一週間後
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.WEEK_OF_MONTH, 1);
		Date nextweek = cal.getTime();
		System.out.println(nextweek);

	}

}
