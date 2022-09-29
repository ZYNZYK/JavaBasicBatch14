package reviewClass5Loops;

public class PatternsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i=1;i<=4;i++) {
			
			for (int j=1; j<=3;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("-----------------");
		

		for (int i=1;i<=5;i++) { //rows
			
			for (int j=1; j<=5;j++) { //columns
				
				System.out.print(j+ " "); //j or i
				
			}
				System.out.println(" ");
			}
		
		System.out.println("------------");
		for (int a=0; a<=4; a++) {
            char sign='*';
            for (int b=1; b<=a+1; b++) {
                System.out.print(sign);
            } System.out.println();
        }

	} 

}
