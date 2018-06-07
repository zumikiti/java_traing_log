
public class kadai3_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1; i <= 50; i++){
			int result = i;
			
			result = sanbai(i, result);
			
			if(result == 0){
				System.out.println(i + "$");
			} else {
				System.out.println(i);
			}
		}
	}
	
	private static int sanbai(int i, int result) {
		// TODO Auto-generated method stub
		while(result >= 3){
			result = i % 3;
		}
		
		return result;
	}
}
