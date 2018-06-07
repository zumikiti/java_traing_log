
public class IfSample01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 100; //成績
		
		if(score == 100){
			System.out.println("満点です！");
		} else if(score >= 80){
			System.out.println("よくできました。");
		} else if(score >= 60){
			System.out.println("合格しています。");
		} else {
			System.out.println("残念でした〜w");
		}
	}

}
