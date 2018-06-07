package test;

public class ReplaceSample {
	
	public static void main(String[] args){
		
		String str = "100どる";
		String sub = str.replaceAll("どる", "円");
		System.out.println(sub);
	}

}
