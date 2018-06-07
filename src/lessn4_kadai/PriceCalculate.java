package lessn4_kadai;

public class PriceCalculate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 3歳、女性、上映20時、not１日、3D映画、水曜
		Customer cus01 = new Customer();
		cus01.setArg(3); //年齢
		cus01.setSex("l"); //性別
		cus01.setstartHour(20); //上映開始時間
		cus01.setisFirstday(true); //１日か
		cus01.setis3D(true); //3Dか
		cus01.setisWednesday(true); //水曜日か
		
		//6歳、男性、上映18時、not１日、3D映画、水曜
		Customer cus02 = new Customer();
		cus02.setArg(6); //年齢
		cus02.setSex("m"); //性別
		cus02.setstartHour(18); //上映開始時間
		cus02.setisFirstday(false); //１日か
		cus02.setis3D(true); //3Dか
		cus02.setisWednesday(true); //水曜日か
		
		//15歳、女性、上映21時、１日、2D映画、水曜
		Customer cus03 = new Customer();
		cus03.setArg(15); //年齢
		cus03.setSex("l"); //性別
		cus03.setstartHour(21); //上映開始時間
		cus03.setisFirstday(true); //１日か
		cus03.setis3D(false); //3Dか
		cus03.setisWednesday(true); //水曜日か
		
		//18歳、女性、上映21時、１日、3D映画、not水曜
		Customer cus04 = new Customer();
		cus04.setArg(18); //年齢
		cus04.setSex("l"); //性別
		cus04.setstartHour(21); //上映開始時間
		cus04.setisFirstday(true); //１日か
		cus04.setis3D(true); //3Dか
		cus04.setisWednesday(false); //水曜日か
		
		result(cus01); result(cus02); result(cus03); result(cus04);
	}
	
	private static void result(Customer cus) {
		// TODO Auto-generated method stub
		int arg = cus.getArg();
		String sex = cus.getSex();
		int startHour = cus.getstartHour();
		Boolean isFirstday = cus.getisFirstday();
		Boolean is3D = cus.getis3D();
		Boolean isWednesday = cus.getisWednesday();
		String result = "";
		int price = -1;
		
		if(arg >= 0 && arg < 6){ //小学生未満
			result ="無料";
		} else if((arg >= 6 && arg < 15) || isFirstday == true){ //小中生or一日
			price = 1000;
		} else if((arg >= 15 && arg < 18) || (sex.equals("l") && isWednesday == true)){ //高校生or水曜日
			price = 1200;
		} else if((arg >=18 && arg < 21) || startHour >= 21){ //大学生orレイトショー
			price = 1500;
		} else if(arg >= 21){ //一般
			price = 1800;
		}
		
		if(is3D == true && result.equals("")){
			price = price + 400;
			result = Integer.toString(price) + "円";
		} else if(result.equals("")){
			result = Integer.toString(price);
		}
		if(arg >= 0){
			System.out.println("料金は" + result + "です。");
		} else {
			System.out.println("年齢の入力に誤りがあります。");
		}
	}
}