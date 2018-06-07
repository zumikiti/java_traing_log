package test;

import java.math.BigDecimal;

public class lessn5_leapyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BigDecimal xxxx = new BigDecimal("2020");
		BigDecimal yyyy = new BigDecimal("2017");
		
		dicesion(xxxx);
		dicesion(yyyy);
		

	}

	private static void dicesion(BigDecimal year) {
		// TODO Auto-generated method stub
		
		BigDecimal waru4 = year.remainder(new BigDecimal("4"));
		BigDecimal waru100 = year.remainder(new BigDecimal("100"));
		BigDecimal waru400 = year.remainder(new BigDecimal("400"));
	
		//System.out.println(waru4);
	
	
		if (waru4.compareTo(BigDecimal.ZERO) == 0 &&
				waru100.compareTo(BigDecimal.ZERO) != 0 || waru400.compareTo(BigDecimal.ZERO) == 0){
			System.out.println(year +"年は、うるう年です。");
		} else {
			System.out.println(year +"年は、平年です。");
		}
	}

}
