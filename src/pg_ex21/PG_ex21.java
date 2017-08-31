package pg_ex21;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PG_ex21 {

	public static void main(String[] args) throws FileNotFoundException {
		//ファイル読み込み
		try{
			  File file = new File("record.log");
			  FileReader filereader = new FileReader(file);


			  int charcter;
			  while((charcter = filereader.read()) != -1){
			  System.out.print((char)charcter);
			  }

			}catch(IOException e){
			  System.out.println(e);
			}

	}

}
