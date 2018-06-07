
public class ChangeWords {
	
	String[][] Words = {{"Ádám, ", "Fiam, ", "Ádi, ", "Figyelj, "}, 
						{"miért nem ", "miért ", "minek ", "most meg miért "}, 
						{"bámulod a gépet?","tanulsz?", "dolgozol?", "segítesz?", "csinálsz valamit?", "figyelsz?"}};
	
	public String letChangeWords() {
		
		String sentence = "";
		
		for(int i = 0; i < Words.length; i++) {
			sentence = sentence + Words[i][(int) (Math.random() * Words[i].length)];
		}
		
		return sentence;
	}
 
}
