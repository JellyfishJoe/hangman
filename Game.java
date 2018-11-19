import java.util.*;
import java.io.*;

public class Game{

	private String targetWord;
	private int targetWordLength;

	public void main(String word){

		List<String> words = new ArrayList<String>();
		List<String> disallowedChars = new ArrayList<String>();
		Game game = new Game();
		Guesser guesser = new Guesser();

		words = game.Reader("C:\\Users\\etone\\Desktop\\javaProjects\\hangman\\res\\words.txt");
		disallowedChars = game.Reader("C:\\Users\\etone\\Desktop\\javaProjects\\hangman\\res\\disallowedChars.txt");
		//System.out.println(words);
		//System.out.println(disallowedChars);

		this.targetWord = word;
		targetWordLength = targetWord.length();
		System.out.println(targetWord);
		System.out.println(targetWordLength);

		guesser.MakeGuessAlphabetical(targetWord, targetWordLength);

	}
	//Read a text file and store the content in an array
	public List<String> Reader(String url){
		List<String> words = new ArrayList<String>();
		try{

			File file = new File(url);
			Scanner fileScanner = new Scanner(file);

			while(fileScanner.hasNext()){
				words.add(fileScanner.next().toLowerCase());
			}

			fileScanner.close();

		} catch(Exception e){

		}

		return words;

	}
	
}