package reviewClass2;

public class NestedDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean studyHard=true;
		if(studyHard) {
			System.out.println("We get the job in first few weeks");
			
			boolean goodCommunicationSkills=true;
			
			if(goodCommunicationSkills) {
				System.out.println("can might get job in Apple/ Amazon, etc");
			} else {
				System.out.println("we need to work on our communication skills");
			}
			
		}
		else {
			System.out.println("it might take alottle longer to get the job");
		}

	}

}
