/*
	ISYS 320
	Name(s):
	Date: 
*/

/*
 4. Your output prediction: touch your head, elbow elbow to your eye ear
  
 */

/*
 6. Were you correct? Explain if you were not (what did you learn?)
 I was way off. I learned that the touch parameters equate to the number of lines of output.  
 I do understand concatenate, but do not understand the strings and the order.
 
 */

public class P4_MysteryTouch {

	 public static void main(String[] args) {
	        String head = "shoulders";
	        String knees = "toes"; 
	        String elbow = "head";
	        String eye = "eyes and ears";
	        String ear = "eye"; 
	        
	        touch(ear, elbow);
	        touch(elbow, ear); 
	        touch(head, "elbow"); 
	        touch(eye, eye);
	        touch(knees, "Toes"); 
	        touch(head, "knees " + knees );
	    }
	    
	    public static void touch(String elbow, String ear) { 
	        System.out.println( "touch your " + elbow + " to your " + ear );
	    }

}
