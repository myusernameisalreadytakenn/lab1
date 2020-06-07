package lab5;

import java.util.ArrayList;
import java.util.List;

public class Sentence {
	
	private List<Word> sentence = new ArrayList<Word>();
	
	public Sentence(StringBuffer sentence) {
		// split sentence to words by delimiter, space or comma
		StringBuffer word = new StringBuffer();
	     
	     for (int i = 0; i < sentence.length(); ++i)
	     {
	    	 if (sentence.charAt(i) == ' ' || sentence.charAt(i) == ',')
	    	 {
	    		 this.sentence.add(new Word(word.toString()));
	    		 word = new StringBuffer();
	    	 }
	    	 else
	    	 {
	    		 word.append(sentence.charAt(i));
	    	 }
	     }
	}

	public List<Word> getSentence() {
		return sentence;
	}

	public void setSentence(List<Word> sentence) {
		this.sentence = sentence;
	}
}
