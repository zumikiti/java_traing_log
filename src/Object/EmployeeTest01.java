package Object;

public class EmployeeTest01 {

	public static void main(String[] args) {
		
		EmployeeSales es = new EmployeeSales(10, "東泉", 100);
		
		//子クラスのフィールドの値をセット
		es.apointment = "丸々商事";
		//親クラスのメソッドも使える。
		es.introduce();
		es.greeting();
		//こクラスのメソッドも使える。
		es.report();
		
		//体力表示
		es.showVitality();
	}

}
