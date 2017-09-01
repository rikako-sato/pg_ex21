package pg_ex21;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PG_ex21 {

	public static void main(String[] args) throws FileNotFoundException {
		//ファイル読み込み
		try{
			  File file = new File("data/record.log");
			  BufferedReader filereader = new BufferedReader(new FileReader(file));


			  String line;
			  while((line = filereader.readLine()) != null){
				  System.out.println(line);
			  }

			}catch(IOException e){
				System.out.println(e);
			}

	}

}
