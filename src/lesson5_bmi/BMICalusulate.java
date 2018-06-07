package lesson5_bmi;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BMICalusulate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BigDecimal height;
		BigDecimal weight;
		
		//175.3cm 59.4kg
		height = new BigDecimal("175.3"); //身長(cm)
		weight = new BigDecimal("59.4"); //体重(kg)
		Customer cus1 = new Customer();
		cus1.setheight(height);
		cus1.setweight(weight);
		
		//173cm 75kg
		height = new BigDecimal("173"); //身長(cm)
		weight = new BigDecimal("75"); //体重(kg)
		Customer cus2 = new Customer();
		cus2.setheight(height);
		cus2.setweight(weight);
		
		judgment(cus1);
		judgment(cus2);
		
	}

	private static void judgment(Customer cus) {
		// TODO Auto-generated method stub
		BigDecimal h = cus.getheight(); //身長をセット。
		BigDecimal w = cus.getwight(); //体重をセット。
		BigDecimal bmi;
		
		System.out.println("身長：" + h + "cm, 体重：" + w + "kg");
		
		//BMI＝ 体重kg ÷ (身長m)2
		h =h.divide(new BigDecimal("100"), 4, RoundingMode.HALF_DOWN);
		bmi = w.divide(h.multiply(h), 1, RoundingMode.HALF_DOWN);
		System.out.println("BMI:" + bmi);
		
		if(bmi.compareTo(new BigDecimal("18.5")) < 0){
			System.out.println("低体重");
		} else if(bmi.compareTo(new BigDecimal("18.5")) >= 0 && bmi.compareTo(new BigDecimal("25")) < 0){
			System.out.println("普通体重");
		} else if(bmi.compareTo(new BigDecimal("25")) >= 0 && bmi.compareTo(new BigDecimal("30")) < 0){
			System.out.println("肥満1度");
		} else if(bmi.compareTo(new BigDecimal("30")) >= 0 && bmi.compareTo(new BigDecimal("35")) < 0){
			System.out.println("肥満2度");
		} else if(bmi.compareTo(new BigDecimal("35")) >= 0 && bmi.compareTo(new BigDecimal("40")) < 0){
			System.out.println("肥満3度");
		} else if(bmi.compareTo(new BigDecimal("35")) >= 0){
			System.out.println("肥満4度");
		}
		
		
	}

}
