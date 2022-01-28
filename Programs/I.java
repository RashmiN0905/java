class I 
{
	public static void main(String[] args) 
	{
		char ch= 8;
		if(ch>='a' && ch<= 'z'){
			if(ch=='a'|| ch=='e'||ch=='i'|| ch=='o'|| ch=='u'){
			System.out.println(ch+ " is a vowel in lowercase");
			}
			else{
			System.out.println(ch+ " is a consonant");
		    }
			}
			else if(ch>='A' && ch<='Z'){
			if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
				System.out.println(ch+ " is a uppercase vowel");
			}
			else{
				System.out.println(ch+ " is a uppercase consonant");
			}
			}
			else if (ch>=0 && ch<=9){
				System.out.println(ch+  " it is a digit");
			}
			else if (ch==' '){
				System.out.println(ch+ " it is a space");
			}
			else{
				System.out.println(ch+ " it is a special character");
			}

			}
			}



			
		
