package test;

import java.math.BigDecimal;

public class kadai5_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//課題1
		//変数に設定した数値の平方根を求め、四捨五入して画面表示してください。
		//桁数は自由に設定してください。
		double sqrt = Math.sqrt(5);
		int rnd = (int) Math.round(sqrt);
		System.out.println("平方根：" + sqrt + ", 四捨五入：" + rnd);
		
		
		//課題２
		//四角形の面積計算をメインメソッド内で行ってください。
		BigDecimal tate2 = new BigDecimal("15");
		BigDecimal yoko2 = new BigDecimal("3");
		BigDecimal menseki2 = tate2.multiply(yoko2);
		System.out.println("四角形の面積は" + menseki2 + "cmです。");
		
		
		//課題3
		//四角形の面積計算を別メソッドに切り出し、 メインメソッドから呼び出して、コンソールに表示してください。
		//なお、戻り値がある形で実装してください。
		BigDecimal menseki3 = menseki3();
		System.out.println("四角形の面積は" + menseki3 + "cmです。");
		
		
		//課題4
		//円周、面積を計算し画面に表示してください。桁数は自由に設定してください。
		
		BigDecimal r = new BigDecimal("5");
		BigDecimal pi = BigDecimal.valueOf(Math.PI);
		//System.out.println(pi);
		BigDecimal s = r.multiply(r).multiply(pi);
		//System.out.println(s);
		BigDecimal l = r.multiply(new BigDecimal("2")).multiply(pi);
		
		System.out.println("半径：" + r + ", 円周：" + l + ", 面積：" + s);
		
	}

	//課題３の外部メソッド。
	private static BigDecimal menseki3() {
		// TODO Auto-generated method stub
		BigDecimal tate3 = new BigDecimal("4.6");
		BigDecimal yoko3 = new BigDecimal("16.9");
		BigDecimal menseki3 = tate3.multiply(yoko3);
		return menseki3;
	}

}
