package test;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Date;

public class InstantSample01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//date > LocalDateTime
		Date date = new Date();
		Instant ins = date.toInstant();
		LocalDateTime ldt1 = LocalDateTime.ofInstant(ins, ZoneOffset.ofHours(9));
		System.out.println(date);
		System.out.println(ldt1);
		
		//LocalDateTime > Date
		LocalDateTime ldt2 = LocalDateTime.now();
		Instant ins2 = ldt2.toInstant(ZoneOffset.ofHours(9));
		Date date2 = Date.from(ins2);
		System.out.println(ldt2);
		System.out.println(date2);

	}

}
