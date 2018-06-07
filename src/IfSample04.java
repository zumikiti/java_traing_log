
public class IfSample04 {
	public static void main(String[] args) {
		int score = 100;
		
		if(score >= 60 && score <= 79) {
			System.out.println("合格です。");
		} else if(score >= 80 && score <= 99){
			System.out.println("よくできました。");
		} else if(score == 100){
			System.out.println("満点！");
		} else {
			System.out.println("残念でした。");
		}
	}

}
