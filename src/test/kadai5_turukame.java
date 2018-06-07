package test;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class kadai5_turukame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//参考サイト：http://www.manabu-oshieru.com/chugakujuken/sansu/tsurukame.html
		
		BigDecimal turu;
		BigDecimal kame;
		BigDecimal asino_kazu;
		BigDecimal turukame_goukei;
		Integer result;
		
		System.out.println("つるとかめが合わせて9ひきいます。足の数は合わせて26本です。");
		System.out.println("つるとかめはそれぞれ何びきいますか。");
		
		turukame_goukei = new BigDecimal("9"); //合計頭数
		asino_kazu = new BigDecimal("26"); //合計足の数
		
		//(実際の足の数-匹数の合計×2)÷2=かめの匹数
		kame = turukame_goukei.multiply(new BigDecimal("2"));
		kame = (asino_kazu.subtract(kame).divide(new BigDecimal("2"), 1, RoundingMode.HALF_UP));
		result = kame.intValue();
		System.out.println("亀は" + result + "匹");
		
		//(匹数の合計×4-実際の足の数)÷2=つるの匹数
		turu =turukame_goukei.multiply(new BigDecimal("4"));
		turu = (turu.subtract(asino_kazu)).divide(new BigDecimal("2"), 1, RoundingMode.HALF_UP);
		result = turu.intValue();
		System.out.println("鶴は" + result + "羽");
		
	}

}
