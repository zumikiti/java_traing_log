
public class kadai3_7_2_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int l = 100;
		int s;
		
		if(l < 0){
			System.out.println("入力データエラーです");
		} else {
			if(l < 100){
				s = 600;
			} else if(l < 250){
				s = 800;
			} else if(l < 500){
				s = 900;
			} else {
				s = 1200;
			}
			
			System.out.println(l + "キロ先に荷物を送るための送料は" + s + "円です");
		}
	}

}
