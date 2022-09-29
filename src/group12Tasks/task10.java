package group12Tasks;

public class task10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Write a java program to find the second largest
		//number in the array?
		
		int[]secondlargestnum= {200,300,400};
	    int highest=0;
	    int secondlargest=0;

	    for (int i=0;i<secondlargestnum.length;i++)
	        if(secondlargestnum[i]>highest) {
	            secondlargest=highest;
	            highest=secondlargestnum[i];
	        }
	        else if ( secondlargestnum[i] > secondlargest) {
	            secondlargest=secondlargestnum[i];

	        }
	        System.out.println(secondlargest);
	}
}

