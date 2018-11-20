import java.util.*;
import java.io.*;

public class Guesser{

	public static void MakeGuessByFile(String targetWord, int targetWordLength, List<String> file){

		List<String> alphabet = new ArrayList<String>();
		Reader reader = new Reader();

		System.out.println("Guess being made");
		System.out.println(file);

		alphabet = reader.main("C:\\Users\\etone\\Desktop\\javaProjects\\hangman\\res\\alphabet.txt");
		
		for (Iterator<String> i = wordList.interator(); i.hasNext();){
			String word = i.next();

		}
	}

	public static void MatchLength(int length){
		
	}
}

