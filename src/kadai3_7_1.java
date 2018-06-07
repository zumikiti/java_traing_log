
public class kadai3_7_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arg = 120;
		
		if(arg>=0 && arg < 20){
			System.out.println("お子様はおかえり！");
		} else if(arg >= 20 && arg < 30){
			System.out.println("20代、まだまだ若いですね！");
		} else if(arg >= 30 && arg < 40){
			System.out.println("30代、もう少しかしら。");
		} else if(arg >= 40){
			System.out.println("40代以上・・・");
		}
		
/*		if(arg < 0){
			System.out.println("年齢の入力に誤りがあります。");
		} else if(arg < 20){
			System.out.println("未成年");
		} else if(arg < 30){
			System.out.println("20代");
		} else if(arg < 40){
			System.out.println("30代");
		} else{
			System.out.println("それ以上");
		}*/
	}
}
