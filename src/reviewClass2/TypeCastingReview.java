package reviewClass2;

public class TypeCastingReview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Explicit/Narrowing/Manual	
		//As we can't fit 129 in byte we will get wrong results
		short largerBox=128;
		byte smallerBox =(byte)largerBox;
		System.out.println (smallerBox);
		
		//Explicit/Narrowing/Manual	
		//As we can fit 129 in byte we will get wrong results

		int largerBox1=129;
		short smallerBox2=(short)largerBox1;
		System.out.println(largerBox1);
		
		//Implicit/Widening/Automatic
		short largerBox3=45;
		long smallerBox3=(short)largerBox3;
		System.out.println(largerBox3);
		

	}

}
