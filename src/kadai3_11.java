
public class kadai3_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] kazu = new String[100];
		
		for(int i=0; i<=99; i++){
/*			String s = Integer.toString(i + 1);
			kazu[i] = s;
*/			
			kazu[i] = Integer.toString(i + 1);
		}
		
		for(int j=0; j <kazu.length; j++){
			System.out.println(kazu[j]);
		}
	}

}
