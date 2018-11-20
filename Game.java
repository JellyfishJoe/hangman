import java.util.*;
import java.io.*;

public class Game{

	private String targetWord;
	private int targetWordLength;

	public void main(String word){

		List<String> words = new ArrayList<String>();
		List<String> disallowedChars = new ArrayList<String>();
		Reader reader = new Reader();
		Guesser guesser = new Guesser();

		words = reader.main("C:\\Users\\etone\\Desktop\\javaProjects\\hangman\\res\\words.txt");
		disallowedChars = reader.main("C:\\Users\\etone\\Desktop\\javaProjects\\hangman\\res\\disallowedChars.txt");
		System.out.println(words);
		//System.out.println(disallowedChars);

		this.targetWord = word;
		targetWordLength = targetWord.length();
		System.out.println(targetWord);
		System.out.println(targetWordLength);

		guesser.MatchLength(targetWordLength);

		guesser.MakeGuessByFile(targetWord, targetWordLength, alphabet);

	}
}