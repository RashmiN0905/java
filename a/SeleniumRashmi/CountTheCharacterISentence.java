public class CountTheCharacterISentence {

	public static void main(String[] args) {
	        String str = "we live in Bengaluru";   
	        int count = 0;    
	        for(int i = 0; i < str.length(); i++) {    
	        if(str.charAt(i)!= ' ')    
	        count++;    
	        }    
	          
	        System.out.println(" number of characters in a SENTENCE: " + count);    
	    }    
	}
