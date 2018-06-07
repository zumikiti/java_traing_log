package Object;

public class InterfaceSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InterfaceEmployee ie01;
		InterfaceEmployee ie02;
		
		ie01 = new EmployeeSalesInterface();
		ie02 = new EmployeeSystemInterface();
		
		ie01.greeting();
		ie02.greeting();
		
		newGreeting(ie01);
		newGreeting(ie02);
		

	}

	static void newGreeting(InterfaceEmployee ie) {
		// TODO Auto-generated method stub
		
		System.out.println("ポリモルフィズです。");
		ie.greeting();
		
	}

}
