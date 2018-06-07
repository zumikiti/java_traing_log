
public class kadai3_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("課題１");
		kadai1();
		
		System.out.println("");
		System.out.println("課題２");
		kadai2();
		
	}

	//課題１のメソッド
	private static void kadai1() {
		// TODO Auto-generated method stub
		int result = 0;
		for(int i=1;i<10;i++){
			String kuku = "";
			
			for(int j=1; j<10; j++){
				result = i*j;
				kuku = kuku + " " + result;
			}
			
			System.out.println(kuku);
		}
	}

	//課題２のメソッド
	private static void kadai2() {
		// TODO Auto-generated method stub
		String dan;
		int result = 0;
		System.out.println("　　　　01 02 03 04 05 06 07 08 09");
		for(int i=1;i<10;i++){
			dan = i + "の段";
			String kuku = " ";
			for(int j=1; j<10; j++){
				result = i*j;
				if(result < 10){
					kuku = kuku + " 0" + result;
				} else {
					kuku = kuku + " " + result;
				}
			}
			dan = dan + kuku;
			System.out.println(dan);
		}
	}
}
