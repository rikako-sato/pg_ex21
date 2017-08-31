package pg_ex21;
import java.time.LocalTime;
import java.util.Scanner;

public class GetInfo {
	//テキストファイルから情報を取得する
	public static String getInfo(){

		Scanner sc = new Scanner(System.in);
		String line  = sc.nextLine();
		String[] word = line.split("",0);


		//String firstchar = sc.next();
		//String secondchar = sc.next();
		//String thirdchar   = sc.next();
		//String fourchar    = sc.next();

		//１桁目の情報を取得
		String firstnum = word[0];
		//２桁目の情報を取得
		String secondnum = word[1];

		//1桁目の情報によって、処理をくべつする
		switch (firstnum){
		//１の時、電話番号を格納する
		case "1":
			String phones;
			phones = word[1];
			return phones;
		//２の時、サービス種別で区別する
		case "2":

			if(secondnum == "C1"){
				String fphone = word[2];
				ConstructInfo.C1(1000, null, fphone, fphone, 0);

			}else if(secondnum == "E1"){

				LocalTime phonetime = LocalTime.parse(word[2]);
				int phonMin = Integer.parseInt(word[3]);
				ConstructInfo.E1(1000, phonetime, phonMin);


			}
		case "5":
				int phoneMin;
				//通話時間を取得
				phoneMin = Integer.parseInt(word[3]);
				LocalTime phoneTime = null;
				phoneTime.parse(word[2]);









		}


		return null;

	}



}
