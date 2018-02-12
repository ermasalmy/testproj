/**
 * 
 */
package ContinueString.java;

/**
 * @author User
 *
 */
public class ContinueString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String text = "		This is my text		";
		//text = text.trim();
		String oldtext = args[0];
		String replace = args[1];
		
		System.out.println("original Text:" + text);
		System.out.println("Replaced Text:" + text.replace(oldtext,  replace).toUpperCase());
		

	}

}
