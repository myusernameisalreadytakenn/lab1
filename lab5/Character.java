package lab5;

public class Character {
	
	private char character;
	
	public Character(char character) {
		this.character = character;
	}
	
	@Override
    public boolean equals(Object o) { 
  
        // If the object is compared with itself then return true   
        if (o == this) { 
            return true; 
        } 
  
        /* Check if o is an instance of Complex or not 
          "null instanceof [type]" also returns false */
        if (!(o instanceof Character)) { 
            return false; 
        } 
          
        // typecast o to Complex so that we can compare data members  
        Character c = (Character) o; 

        return this.getCharacter() == c.getCharacter();
    }

	public char getCharacter() {
		return character;
	}

	public void setCharacter(char character) {
		this.character = character;
	}
}
