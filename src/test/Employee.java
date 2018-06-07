package test;

public class Employee {
	//フィールド
	public String employeeName;
	public String divisionName;
	public int vitality;
	
	//コントラスたされた
	Employee() {
		System.out.println("コントラクタが呼び出された。");
		employeeName = "未設定";
		divisionName = "営業";
		vitality = 0;
	}
	
	//引数ありのコントラクタ
	Employee(String employeeName, String divisionName, int vitality) {
		System.out.println("初期化時に引数ありコンストラクタが呼ばれました");
		this.employeeName = employeeName;
		this.divisionName = divisionName;
		this.vitality = vitality;
	}
	
	
	//自己紹介メソッド
	public void introduce() {
		vitality = vitality -10;
		System.out.println("私の名前は" + employeeName + "です。");
		System.out.println("所属部署は" + divisionName + "です。");
	}
	//挨拶するメソッド
	public void greeting() {
		vitality = vitality - 10;
		System.out.println("おはようございます。");
	}
	
	//挨拶するメソッド　オーバーライド
	void greeting(String divisionName){
		vitality = vitality - 10;
		System.out.println(divisionName + "のみなさん、おはようございます。");
	}
	
	//報告するメソッド
	public void report(){
		vitality = vitality - 10;
		System.out.println("今日は10件アポイントとりました。");
	}
	
	//残り体力を知らせるメソッド
		public void showVitality(){
			vitality = vitality - 10;
			System.out.println("残りの体力は" + vitality);
		}
		
		//出勤するメソッド
		public void attenddance(){
			
		}
		
		//退勤するメソッド
		public void leaveWork() {
			
		}
}
