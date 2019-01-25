import java.util.*;
import java.io.*;

public class Game{

	private String targetWord;
	private int targetWordLength;
	private String guess;

	public void main(String word){

		List<String> words = new ArrayList<String>();
		List<String> disallowedChars = new ArrayList<String>();
		List<String> alphabet = new ArrayList<String>();
		Reader reader = new Reader();
		Guesser guesser = new Guesser();

		words = reader.main("C:\\Users\\etone\\Desktop\\javaProjects\\hangman\\res\\words.txt");
		disallowedChars = reader.main("C:\\Users\\etone\\Desktop\\javaProjects\\hangman\\res\\disallowedChars.txt");
		alphabet =  reader.main("C:\\Users\\etone\\Desktop\\javaProjects\\hangman\\res\\alphabet.txt");
		System.out.println(words);
		//System.out.println(disallowedChars);

		this.targetWord = word;
		targetWordLength = targetWord.length();
		System.out.println(targetWord);
		System.out.println(targetWordLength);

		//words = guesser.CleanUp(words, disallowedChars);

		//System.out.println(words);

		words = guesser.FilterLength(words, targetWordLength);
		System.out.println(words);

		guess = guesser.GuessByAlphabet(alphabet);
		System.out.println(guess);

		//guesser.MostCommonLetterGuess(targetWord, targetWordLength, alphabet);

	}
}