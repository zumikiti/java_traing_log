
public class kadai2_1 {
	public static void main(String[] args){
		int p = 39980;
		int tax;
		tax = tax(p);
		
		System.out.println(p +"円の商品の税込み価格は" + (p+tax) + "円（消費税は" + tax + "円）です。");
	}

	private static int tax(int p) {
		// TODO Auto-generated method stub
		int tax = (int) (p * 0.08);
		return tax;
	}

}
