import java.util.*;
import java.io.*;

public class Reader{
	//Read a text file and store the content in an array
	public List<String> main(String url){
		List<String> wordList = new ArrayList<String>();
		try{
			File file = new File(url);
			Scanner fileScanner = new Scanner(file);

			while(fileScanner.hasNext()){
				wordList.add(fileScanner.next().toLowerCase());
			}
			fileScanner.close();
		} catch(Exception e){

		}
		return wordList;
	}	
}