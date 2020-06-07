package lab5;

import java.util.ArrayList;
import java.util.List;

public class Text {
	
	private List<Sentence> text = new ArrayList<Sentence>();

	public Text(StringBuffer text) {
	     // split text into sentences
	     StringBuffer sentense = new StringBuffer();
	     
	     for (int i = 0; i < text.length(); ++i)
	     {
	    	 if (text.charAt(i) == '.')
	    	 {
	    		 this.text.add(new Sentence(sentense));
	    		 sentense = new StringBuffer();
	    	 }
	    	 else
	    	 {
	    		 sentense.append(text.charAt(i));
	    	 }
	     }
	}
	
	public List<Sentence> getText() {
		return text;
	}

	public void setText(List<Sentence> text) {
		this.text = text;
	}
}
