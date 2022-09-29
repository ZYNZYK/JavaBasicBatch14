package reviewClass5Loops;

public class ForLoopDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1 3 7 9
		
		for (int i =1; i<=9; i+=2) {
			
			if(i==5) {  //if(i!=5 System.out.prinlnt(i) without continue;				
				continue;
			}
			System.out.println(i);
		}
		System.out.println("-------------");
		
		boolean day=true;
		
		for(int i=1;i<=3;i++) {
		
		
		while(day) {
			System.out.println("Good day"); //inner loop is a infinite loop,stuck in in the inner loop
		}
		System.out.println(i);
		break;
		}
	}
}


