
public class ArraySample01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] score = {90, 100, 120, 80, 95, 90};
		
		for(int i=0; i<score.length; i++){
			System.out.println(score[i] + "for");
		}
		for(int j : score){
			System.out.println(j + "拡張for");
		}
	}

}
