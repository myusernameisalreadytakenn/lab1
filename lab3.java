import java.util.ArrayList;
import java.util.List;

public class lab3 {
	 public static void main(String[] args) {

		 final StringBuffer text = new StringBuffer("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.");
	     final String[] words = {"Lorem", "ut", "in"};
	     
	     // split text into sentenses
	     List<StringBuffer> sentenses = new ArrayList<StringBuffer>();
	     StringBuffer sentense = new StringBuffer();
	     
	     for (int i = 0; i < text.length(); ++i)
	     {
	    	 if (text.charAt(i) == '.')
	    	 {
	    		 sentenses.add(sentense);
	    		 sentense = new StringBuffer();
	    	 }
	    	 else
	    	 {
	    		 sentense.append(text.charAt(i));
	    	 }
	     }
	     
	     // find word in sentenes
	     for (int i = 0; i < words.length; ++i)
	     {
	    	 int count = 0;
	    	 
	    	 for (int j = 0; j < sentenses.size(); ++j)
	    	 {
	    		 // count how many sentenses contain the word
	    		 StringBuffer sent = sentenses.get(j);
	    		 
	    		 for (int k = 0; k < sent.length(); ++k)
	    		 {
	    			 String potentialWord = sent.substring(k);
	    			 
	    			 int spacePos = potentialWord.indexOf(' ');
	    			 int lastIdx = (spacePos != -1) ? spacePos : potentialWord.length() - 1;
	    			 potentialWord = potentialWord.substring(0, lastIdx);
	    			 
    				 if (potentialWord.equals(words[i]))
    				 {
    					 count++;
	    				 break;
	    			 }
	    		 }
	    		 
	    	 }
	    	 System.out.println(words[i] + " is found in " + count + " sentenses");
	     }
	 }
}
