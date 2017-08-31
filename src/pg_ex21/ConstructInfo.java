package pg_ex21;

import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;

public class ConstructInfo {
	//サービス種別C1の時の処理内容
	public static int C1(int vase, String family1,String family2,String phones,int time){
		//基本料金に１００円を足す
		int kihon = vase + 100;
		int tell = 0;
		//家族料金の計算を行う
		String[] family = {family1,family2};
		for(int i = 0 ; i<family.length ; i++){
			if(phones.equals(i)){
				tell = time * 20/5;
			}

		}
		int total = kihon + tell;
		return total;
	}

	//家族料金に登録されている電話番号
	public static Set<String> phoneNum(){

		Set<String> phones = new HashSet<String>();
		phones.add("090-1234-0001");
		phones.add("090-1234-0002");
		phones.add("090-1234-0003");

		return phones;

	}
	//サービス種別E1の内容
	public static int E1(int vase,LocalTime phoneTime,int phoneMin){
		int total = vase + 200;

		LocalTime startTime = LocalTime.of(8,0,0);
		LocalTime endTime    = LocalTime.of(17, 59, 0);

		if(phoneTime.isAfter(startTime) && phoneTime.isBefore(endTime)){
			total = total - (phoneMin * 5);


		}
		return total;




		//c.setTime(date);

		//Date time = c.getTime();
		//boolean isPeriod(Calendar start, Calendar end) {
		  //    Calendar cur = Calendar.getInstance();
		    //  return cur.after(start) && cur.before(end);
		    //}

		//Date startTime = new Date( 8, 00, 00);
		//Date endTime = new Date( 17, 59, 00);




	}


	/*public static Map<String, List<String>> phoneNum(){

		Map<String,List<String>> phones = new HashMap<String,List<String>>();

			List<String> kidsphone = new ArrayList<String>();

			kidsphone.add("090-1234-0002");
			kidsphone.add("090-1234-0003");

		phones.put("090-1234-0001", kidsphone);

		return phones;

	**/


}
