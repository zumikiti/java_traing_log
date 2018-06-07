package Object;

/**
 * @author teke
 *
 */
public class EmployeeBase {
	public int employeeID; //社員ID
	public String employeeName; //社員名
	public String divisionName; //部署名
	public int vitality; //体力
	
	//コントラクタ
	EmployeeBase(){
		
	}
	
	//引数ありコントラクタ
	EmployeeBase(int employeeID, String employeeName, String divisionName, int vitality){
		this.employeeID = employeeID;
		this.employeeName = employeeName;
		this.divisionName = divisionName;
		this.vitality = vitality;
	}
	
	//自己紹介メソッド
	void introduce(){
		vitality = vitality -10;
		System.out.println("私の名前は、" + employeeName + "です。");
		System.out.println("所属部署は、" + divisionName + "です。");
	}
	
	//挨拶するメソッド
	void greeting(){
		vitality = vitality -10;
		System.out.println("おはようございます。");
	}
	
	//挨拶するメソッドのオーバーライド
	void greeting(String divisionName){
		vitality = vitality -10;
		System.out.println( divisionName + "のみなさまおはようございます。");
	}
	
	void showVitality(){
		vitality = vitality -10;
		System.out.println("残り体力は" + vitality);
	}
}
