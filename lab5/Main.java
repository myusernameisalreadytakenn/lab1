package lab5;

public class Main {

	public static void main(String[] args) {

		final Text text = new Text(new StringBuffer("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum."));
		final Word[] words = {new Word("Lorem"), new Word("ut"), new Word("in")};
		
		for (Word w : words) {
			
			int count = 0;
			
			for (Sentence s : text.getText()) {
				
				for (Word ws : s.getSentence()) {
					if (ws.equals(w)) {
						count++;
						break;
					}
				}
			}
			System.out.println(w + " is found in " + count + " sentenses");
		}
	}

}
