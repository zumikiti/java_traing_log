package test;

public class ObjectSample02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee emp01 = new Employee();
		//emp01.employeeName = "大島";
		//emp01.divisionName = "営業部";
		emp01.vitality = 150;
		emp01.introduce();
		emp01.showVitality();
		
		Employee emp02 = new Employee();
		emp02.employeeName = "原川";
		emp02.divisionName = "営業部";
		emp02.vitality = 250;
		emp02.introduce();
		emp02.greeting();
		emp02.report();
		emp02.showVitality();
		
		Employee emp04 = new Employee("櫛引","総務部", 150);
		emp04.introduce();
		emp04.showVitality();
		
		String divisionName = "総務部";
		Employee emp05 = new Employee("東泉", divisionName, 300);
		emp05.greeting();
		emp05.greeting(divisionName);
		emp05.showVitality();
		
	}

}