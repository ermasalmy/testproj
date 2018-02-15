/**
 * 
 */
package ContinueString.java;

/**
 * @author User
 *
 */
public class TestingException {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
		String name = args[0];
		System.out.println("Your name is :" + name);
		
		if (!(name.startsWith("M"))) {
			throw new Exception("Name should starts with M");
				
		}
		
		System.out.println("Name printed..");
			
		
		}catch(ArrayIndexOutOfBoundsException ae) {
			System.out.println("Please provide your name as Command line parameter. eg:" +"java TestingExcpetions <Your Name> ");
		
	}catch (Exception ex) {
		System.out.println(ex.getMessage ());
	}

