package test;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class JavaLesson7_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double result;
		result = 0.7 + 0.11;
		System.out.println(result);
		
		BigDecimal num1 = new BigDecimal("0.9");
		BigDecimal num2 = new BigDecimal("0.11");
		
		//足し算
		BigDecimal result3 = num1.add(num2);
		System.out.println("足し算の結果" + result3);
		
		//引き算
		result3 = num1.subtract(num2);
		System.out.println("引き算の結果" + result3);
		
		//掛け算
		result3 = num1.multiply(num2);
		System.out.println("掛け算の結果" + result3);
		
		//割り算
		result3 = num1.divide(num2, 4, RoundingMode.HALF_UP);
		System.out.println("割り算の結果" + result3);
		
		//剰余
		result3 = num1.remainder(num2);
		System.out.println("剰余の結果" + result3);
	}

}
