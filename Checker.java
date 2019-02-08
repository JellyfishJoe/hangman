import java.util.*;

public class Checker{

	public void main(){

	}

	public List<String> CheckGuess(String guess, String target){
		List<String> successArray = new ArrayList<String>();
		List<String> targetArray = target.split("");
		for(String letter : targetArray){
			if(guess == letter){
				successArray.add(letter);
			}
		}
		return successArray;
	}
}