package test;

public class JavaLesson7_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = new String("abc");
		
		//一致しない。
		if (str1 == "abc"){
			System.out.println("一致しました。");
		} else {
			System.out.println("一致していません。");
		}
		
		//一致する
		if (str1.equals("abc")){
			System.out.println("一致しました。");
		} else {
			System.out.println("一致していません。");
		}
		
		//newを使わないと一致する。
		String str2 = "abc";
		if (str2 == "abc"){
			System.out.println("一致しました。");
		} else {
			System.out.println("一致していません。");
		}
	}

}
