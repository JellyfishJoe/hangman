import java.io.*;
import java.util.*;

public class Guesser{

	public static void main(String[] args) throws Exception{
		File file = new File("C:\\Users\\etone\\Desktop\\javaProjects\\hangman\\words.txt");
		Scanner fileScanner = new Scanner(file);

		List<String> words = new ArrayList<String>();

		while(fileScanner.hasNext()){
			words.add(fileScanner.next());
		}
		fileScanner.close();

		System.out.println(words);
	}
}

