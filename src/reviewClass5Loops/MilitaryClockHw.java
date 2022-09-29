package reviewClass5Loops;

public class MilitaryClockHw {
	
	public static void main(String[] args) {
		
		String time=null;
	
		for (int hour = 0; hour <= 23; hour++) {
			
            for (int mins = 00; mins <= 59; mins++) {
            	
                for (int s = 0; s <= 59; s++) {
                	
                    if (hour < 10 && mins < 10 && s < 10) {
                    	
                        System.out.println("0" + hour + ":" + "0" + mins + ":" + "0" + s);
                        
                    } else if (hour < 10 && mins < 10) {
                    	
                        System.out.println("0" + hour + ":" + "0" + mins + ":" + s);
                        
                    } else if (hour < 10&& s<10) {
                    	
                        System.out.println("0"+hour + ":" + mins + ":"+"0" + s);
                        
                    } else if (hour < 10) {
                    	
                        System.out.println("0" + hour + ":" + mins + ":" + s);
                        
                    }    else if (mins < 10 && s < 10) {
                    	
                            System.out.println( hour + ":" + "0" + mins + ":" +"0"+ s);
                            
                    } else if (mins < 10) {
                    	
                        System.out.println(hour + ":" + "0" + mins + ":" + s);
                        
                    } else if (s < 10) {
                    	
                        System.out.println(hour + ":" + mins + ":" + "0" + s);
                        
                    } else {
                    	
                        System.out.println(hour + ":" + mins + ":" + s);
                        
                    }
                }
               


 
        }
	}
		}
}

	
		
		