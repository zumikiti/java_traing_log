
public class kadai3_7_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String myblood = "b";
		int arg = 28;
		
		if("b".equals(myblood)){
			System.out.println("あなたの思い通りに物事が進みそうです");
		} else {
			System.out.println("余裕をもった行動を心がけて");
		}
		
		if("a".equals(myblood)){
			System.out.println("ゆったりとした気分で過ごせそう");
		} else if("b".equals(myblood)){
			System.out.println("なりたい自分を思い描いて");
			if(arg >=20 && arg < 30){
				System.out.println("人との心の距離に気をつけて");
			} else {
				System.out.println("短所も長所に変えられます");
			}
		} else if("o".equals(myblood)){
			System.out.println("情報収集が吉");
		} else if("ab".equals(myblood)){
			System.out.println("本当に大切なものが見えてきそう");
		} else {
			System.out.println("余裕をもった行動を心がけて");
		}
	}

}
