package test;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class lessn5_museum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BigDecimal rate = new BigDecimal("750"); //入場料
		BigDecimal discount = rate.subtract(
				rate.divide(new BigDecimal("4"), 0, RoundingMode.HALF_DOWN));//15人以上で割引が適用された料金。
		BigDecimal menber = new BigDecimal("12");// 人数
		BigDecimal goukei;//合計の料金
		
		//System.out.println("デスカウントでは、" + discount + "です。");
		
		if(menber.compareTo(BigDecimal.ZERO) > 0 && menber.compareTo(new BigDecimal("15")) < 0){
			goukei = menber.multiply(rate);
			System.out.println(menber + "人で合計" + goukei +"円です。");
			System.out.println("一人当たり、" + rate + "です。");
		} else if(menber.compareTo(new BigDecimal("15")) >= 0){
			goukei = menber.multiply(discount);
			System.out.println(menber + "人で" + goukei +"円です。");
			System.out.println("一人当たり、" + discount + "です。");
		} else{
			System.out.println("人数の入力に誤りがあります。");
		}

	}

}
