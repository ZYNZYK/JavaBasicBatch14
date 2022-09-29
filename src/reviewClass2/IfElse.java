package reviewClass2;

public class IfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 0;

        if (number > 0) {
            System.out.println("number is positive");
        }
        if (number < 0) {
            System.out.println("number is negative");

        }
        if (number == 0) {
            System.out.println("number is 0");

/////////////****************** if else condition is better than (if/if/if-from above) SECOND Program****************
            
            
            /*
             * whenever you have to check more than 2 conditions always use if else conditions
             *
             */

       if (number > 0) 
        {
            System.out.println("number is positive");
        } 
        else if (number < 0) 
        {
            System.out.println("number is negative");

        }
        else  {
            System.out.println("number is 0");
        }

        }
}
}