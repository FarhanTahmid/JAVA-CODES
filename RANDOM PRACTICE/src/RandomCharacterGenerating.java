
public class RandomCharacterGenerating {

	public static void main(String[] args) {
		char randCh=(char)(Math.random()*('z'-'a'+1)+'a');
		System.out.println("The random character is '"+randCh+"'");

	}

}
