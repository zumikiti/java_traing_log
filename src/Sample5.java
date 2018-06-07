
public class Sample5 {
	public static void main(String[] args){
		int num1 = 100;
		int num2 = 10;
		
		sumMethod01(num1, num2);
		
		int result;
		result = sumMethod2(num1, num2);
		System.out.println(result + "method2");
	}

	private static void sumMethod01(int num1, int num2) {
		// TODO Auto-generated method stub
		int result = num1 + num2;
		System.out.println(result + "method1");
	}

	private static int sumMethod2(int num1, int num2) {
		int result = num1 + num2;
		return result;
	}
}
