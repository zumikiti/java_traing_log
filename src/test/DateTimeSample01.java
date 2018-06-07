package test;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZonedDateTime;

public class DateTimeSample01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);
		
		OffsetDateTime odt = OffsetDateTime.now();
		System.out.println(odt);
		
		ZonedDateTime zdt = ZonedDateTime.now();
		System.out.println(zdt);

	}

}
