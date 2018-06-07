package lesson5_bmi;

import java.math.BigDecimal;

public class Customer {
	
	private BigDecimal weight;
	private BigDecimal height;
	
	Customer(){
	}
	
	Customer(BigDecimal weight, BigDecimal height){
		this.weight = weight;
		this.height = height;
	}
	
	public BigDecimal getwight(){
		return weight;
	}
	
	public void setweight(BigDecimal weight){
		this.weight = weight;
	}
	
	public BigDecimal getheight(){
		return height;
	}
	
	public void setheight(BigDecimal height){
		this.height = height;
	}

}
