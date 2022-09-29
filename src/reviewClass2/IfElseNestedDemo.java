package reviewClass2;

public class IfElseNestedDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * "Nested If Conditions" are conditions which are dependent on each over, if outer condition is not True
		 * inner condition is never checked, inner conditions are only checked when outer condition
		 * is passed
		 */
		
		int money=10;
		if(money>10) { // outer condition is not true, nothing will happen (money=10 not more than 10)
			System.out.println("Lets buy some eggs");
			int noOfEggs=2;
			if(noOfEggs > 0) {
				System.out.println("Lets boil the eggs");
/////****************************				
				int Money=12;
				if(money>10) { //true condition
					System.out.println("Lets buy some eggs");
					int noOfeggs=2;
					if(noOfEggs > 0) {
						System.out.println("Lets boil the eggs");
			}
		}
	}


		}
	}
}
