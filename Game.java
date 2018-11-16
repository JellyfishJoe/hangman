import java.util.*;
import java.io.*;

public class Game{

	private String guessWord;

	public void main(String targetWord){

		List<String> words = new ArrayList<String>();
		List<String> disallowedChars = new ArrayList<String>();
		Game game = new Game();
		Guesser guesser = new Guesser();

		words = game.Reader("C:\\Users\\etone\\Desktop\\javaProjects\\hangman\\words.txt");
		disallowedChars = game.Reader("C:\\Users\\etone\\Desktop\\javaProjects\\hangman\\disallowedChars.txt");
		System.out.println(words);
		System.out.println(disallowedChars);

		this.guessWord = targetWord;
	}

	public List<String> Reader(String url){
		List<String> words = new ArrayList<String>();
		try{
			File file = new File(url);
			Scanner fileScanner = new Scanner(file);

			while(fileScanner.hasNext()){
				words.add(fileScanner.next());
			}

			fileScanner.close();	
		} catch(Exception e){

		}

		return words;
	}
	
}