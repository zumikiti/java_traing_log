public class kadai3_7_2_1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int kg = 100;
		int souryo;
		
		if(kg < 0){
			System.out.println("入力データエラーです");
		} else{
			if(kg < 1){
				souryo = 250;
			} else if(kg < 3){
				souryo = 400;
			} else if(kg < 5){
				souryo = 500;
			} else if(kg < 10){
				souryo = 900;
			} else{
				souryo = 1200;
			}
			
			System.out.println("この荷物の重さは" + kg + "キロで送料は" + souryo + "円です");
		}
	}

}
