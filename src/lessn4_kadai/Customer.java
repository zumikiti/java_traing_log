package lessn4_kadai;

public class Customer {
	private int arg; //年齢
	private String sex; //性別 m/l
	private boolean isFirstday; //一日割引判定
	private boolean isWednesday; //水曜日か
	private int startHour; //上映時間
	private boolean is3D; //3d判定
	
	Customer(){
	}
	
	Customer(int arg, String sex, boolean isFirstday, boolean isWednesday, int startHour, boolean is3D){
		System.out.println("初期化時に引数ありコンストラクタが呼ばれました");
		this.arg = arg;
		this.sex = sex;
		this.isFirstday = isFirstday;
		this.isWednesday = isWednesday;
		this.startHour = startHour;
		this.is3D = is3D;
	}
	
	public int getArg(){
		return arg;
	}

	public void setArg(int arg) {
		// TODO Auto-generated method stub
		this.arg = arg;
	}
	
	public String getSex(){
		return sex;
	}
	
	public void setSex(String sex){
		this.sex = sex;
	}
	
	public Boolean getisFirstday() {
		return isFirstday;
	}
	
	public void setisFirstday(Boolean isFirstday) {
		this.isFirstday = isFirstday;
	}
	
	public Boolean getisWednesday(){
		return isWednesday;
	}
	
	public void setisWednesday(Boolean isWednesday){
		this.isWednesday = isWednesday;
	}
	
	public int getstartHour(){
		return startHour;
	}
	
	public void setstartHour(int startHour){
		this.startHour = startHour;
	}
	
	public Boolean getis3D(){
		return is3D;
	}
	
	public void setis3D(Boolean is3D){
		this.is3D = is3D;
	}
}
