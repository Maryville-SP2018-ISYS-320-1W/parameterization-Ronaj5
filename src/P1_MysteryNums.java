/*
	ISYS 320
	Name(s):
	Date: 
*/

/*
 1. Your output prediction: I had no idea what the output would be
  
  
 */

/*
 3. Were you correct? Explain if you were not (what did you learn?)
  I understand better now than before but slow in "getting it"
 
 */

public class P1_MysteryNums {

	public static void main(String[] args) {
		int x = 15;
		sentence(x, 42);

		int y = x - 5;
		sentence(y, x + y);
	}

	public static void sentence(int num1, int num2) {
		System.out.println(num1 + " " + num2);
	}

}
