package reviewClass7StringMethods;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "hello";
		// to Upper/lower case
		str.toUpperCase();
		System.out.println(str);

		System.out.println("-----------------");

		str = str.toUpperCase();
		System.out.println(str);

		// LENGTH()->>> GIVES THE SIZE
		int size = str.length();
		System.out.println(size);

		// charAt() ->>> return value at the specified indexes
		char letter = str.charAt(4);
		System.out.println(letter);

		// how to get last character
		str.charAt(str.length() - 1);

		// indexOf ->> returns the index within this string of the first character
		int index = str.indexOf(letter);
		System.out.println(index);
		System.out.println(str.indexOf('a'));

		// isEmpty()-->>> returns true if length is more than zero
		boolean empty = str.isEmpty();
		System.out.println(empty);

		// trim();->>>removes spaces before the string and after the string
		String textFromApplication = " Enroll today ";
		String textFromApplicationUserStory = "Enroll today";
		if (textFromApplication.trim().equals(textFromApplicationUserStory)) {
			System.out.println("Text is matched.Test Pass");
		} else {
			System.out.println("Text is Not matched.test failed");
		}
		System.out.println(textFromApplication.trim());
		System.out.println(textFromApplication); // without trim ->>with spaces

		// substring

		String str1 = "Hello Class";
		String part2 = str1.substring(6);// Class //vallue of the class
		System.out.println(part2);
		// Hello
		String part1 = str1.substring(0, 5);
		System.out.println(part1);

		// concat ->> bring 2 string together

		String newString = part1.concat(" ").concat(part2);
		System.out.println(newString);
		System.out.println(part1 + part2);

		// examples
		char single = newString.substring(6).charAt(0); // class c
		System.out.println(single);

		// newString.charAt(0).substring(6);

		// replace();
		String myString = "Today is September";
		myString = myString.replace("September", "October");// replaces if find
		System.out.println(myString);
		myString.replace("A", "W"); // does not replaces if not find
		System.out.println(myString);

		// split(); ->>>cuts out the string
		String myStr = "Today is the review Class";
		String []array =myStr.split(" ");
		System.out.println(array.length);
		
		System.out.println(array[3]);//review
		for (int i=0;i<array.length;i++) {
			System.out.println(array[i]); //all the elements
			
			//other way 
			for(String arr:array) {
				System.out.println(arr);
				
			//
				String str3="hello";
				String nwString="";
				for (int y=str3.length()-1;y>=0;y--) {
					nwString=nwString+str.charAt(y);
				
					
			//stringBuilder
			String name = "Japan";
			String reverse = "";
			for(int z=name.length()-1;z>=0; z--){
			reverse+=name.charAt(z);
			        }
			 System.out.println(reverse);
			                    //OR
				StringBuilder stringBuilder = new StringBuilder("JAPAN");
				System.out.println(stringBuilder.reverse());
			    System.out.println(stringBuilder.toString().toLowerCase());
		
				}

				
				
				
			}
		}

	}

}
