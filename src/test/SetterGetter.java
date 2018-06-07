package test;

public class SetterGetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeVo ev = new EmployeeVo();
		ev.setEmployeeName("東"); //setter
		String ename = ev.getEmployeeName(); //getter
		System.out.println(ename);

	}

}
