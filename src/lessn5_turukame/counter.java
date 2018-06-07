package lessn5_turukame;

import java.math.BigDecimal;

public class counter {
	
	BigDecimal a;
	BigDecimal b;
	BigDecimal total_v;
	BigDecimal total_n;
	
	counter(){
		
	}
	
	counter(BigDecimal a, BigDecimal b, BigDecimal total_v, BigDecimal total_n){
		System.out.println("初期化時に引数ありコンストラクタが呼ばれました");
		this.a = a;
		this.b = b;
		this.total_v = total_v;
		this.total_n = total_n;
	}
	
	public BigDecimal get_a(){
		return a;
	}
	
	public void set_a(BigDecimal a){
		this.a = a;
	}
	
	public BigDecimal get_b(){
		return b;
	}
	public void set_b(BigDecimal b){
		this.b = b;
	}
	
	public BigDecimal get_total_v(){
		return total_v;
	}
	
	public void set_total_v(BigDecimal total_v){
		this.total_v = total_v;
	}
	
	public BigDecimal get_total_n(){
		return total_n;
	}
	
	public void total_m(BigDecimal total_n){
		this.total_n = total_n;
	}

}
