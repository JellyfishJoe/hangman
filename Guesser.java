import java.util.*;
import java.io.*;

public class Guesser{

	static List<String> passingWords = new ArrayList<String>();

	public static void MostCommonLetterGuess(String targetWord, List<String> wordList){
		
	}

	public static List<String> CleanUp(List<String> wordList, List<String> badCharsList){
		for (String word : wordList){
			for (String badChar : badCharsList){
				if (word.indexOf(badChar) < 0){
					passingWords.add(word);
				}
			}
		} 
		return passingWords;
	}

	//Remove all words from words.txt array that aren't the same length as the target word
	public static List<String> FilterLength(List<String> wordList, int targetWordLength){
		for (String word : wordList){
			if (word.length() == targetWordLength){
				passingWords.add(word);
			}
		}
		return passingWords;
	}
}

