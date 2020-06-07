package lab5;

import java.util.ArrayList;
import java.util.List;

public class Word {
	
	private List<Character> word = new ArrayList<Character>();
	
	public Word(String word) {
		for (char c : word.toCharArray()) {
			this.word.add(new Character(c));
		}
	}
	
	@Override
    public String toString() {
		StringBuffer w = new StringBuffer();
		for (Character c : word) {
			w.append(c.getCharacter());
		}
        return w.toString(); 
    }
	
	@Override
    public boolean equals(Object o) { 
  
        // If the object is compared with itself then return true   
        if (o == this) { 
            return true; 
        } 
  
        /* Check if o is an instance of Complex or not 
          "null instanceof [type]" also returns false */
        if (!(o instanceof Word)) { 
            return false; 
        } 
          
        // typecast o to Complex so that we can compare data members  
        Word c = (Word) o; 
          
        // Compare the data members and return accordingly
        if (c.getWord().size() != this.getWord().size())
        {
        	return false;
        }
        
        // now we have the same size find first non equal character
        for (int i = 0; i < c.getWord().size(); ++i)
        {
        	Character c1 = c.getWord().get(i);
        	Character c2 = this.getWord().get(i);
        	
        	if (!c1.equals(c2)) {
        		return false;
        	}
        }
        
        return true; 
    }
	
	public List<Character> getWord() {
		return word;
	}

	public void setWord(List<Character> word) {
		this.word = word;
	}
}
