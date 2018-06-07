package Object;

public class AbstractSample01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AbstractEmployee emp01;
		AbstractEmployee emp02;
		
		emp01 = new EmployeeGreral();
		emp02 = new EmployeeSystem();
		
		emp01.greeting();
		emp02.greeting();

	}

}
