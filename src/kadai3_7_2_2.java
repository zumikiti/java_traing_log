
public class kadai3_7_2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String saki = "甲信越";
		int souryo;
		
		if("北海道".equals(saki)){
			souryo= 1000;
		} else if ("東北".equals(saki) || "中国".equals(saki)){
			souryo= 800;
		} else if ("関東".equals(saki) || "甲信越".equals(saki) || "四国".equals(saki)){
			souryo= 700;
		} else if ("中部".equals(saki)){
			souryo= 650;
		} else if ("近畿".equals(saki)){
			souryo= 600;
		} else if ("九州".equals(saki) || "沖縄".equals(saki)){
			souryo= 950;
		} else {
			souryo= 0;
		}
		
		if(souryo== 0){
			System.out.println("入力データエラーです");
		} else {
			System.out.println(saki + "への送料は"+ souryo+"円です");
		}
	}
}
