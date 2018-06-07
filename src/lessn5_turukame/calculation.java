package lessn5_turukame;

import java.math.BigDecimal;

public class calculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("つるとかめが合わせて9ひきいます。足の数は合わせて26本です。");
		System.out.println("つるとかめはそれぞれ何びきいますか。");
		
		counter c1 = new counter();
		c1.a = new BigDecimal("2");
		c1.b = new BigDecimal("4");
		c1.total_v = new BigDecimal("26");
		c1.total_n = new BigDecimal("9");
		
		result(c1);
	}

	private static void result(counter counter) {
		// TODO Auto-generated method stub
		System.out.println("resultが呼び出されてます。");
		BigDecimal a = counter.a;
		BigDecimal b = counter.b;
		BigDecimal total_v = counter.total_v;
		BigDecimal total_n = counter.total_n;
		
		if(a.compareTo(b) > 0){
			System.out.println("動いてます。");
		} else {
			System.out.println(a +"＜" + b);
		}
	}

}
