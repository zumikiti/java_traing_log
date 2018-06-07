package Object;

public class EmployeeSales extends EmployeeBase{
	
	//フィールド
	public String apointment;
	
	//コントラクタ
	EmployeeSales(){
	}
	
	//引数つきコントラクタ
	EmployeeSales(int employeeId, String employeeName, int vitality){
		super.employeeID = employeeId;
		super.employeeName = employeeName;
		super.divisionName = "営業部";
		super.vitality = vitality;
		this.apointment = "未定";
	}
	
	//報告するメソッド
	void report(){
		vitality = vitality - 10;
		System.out.println("今日は10件のアポイントをとりました。");
	}
	
	@Override
	void introduce(){
		vitality = vitality -10;
		System.out.println("私の名前は、" + employeeName + "です。");
		System.out.println("所属部署は、" + divisionName + "です。");
		System.out.println("今日のアポイント先は、" + apointment + "です。");
	}
	
	@Override
	void greeting(){
		vitality = vitality -10;
		System.out.println(super.divisionName + "のみなさん" + "おはようございます。");
	}
}
