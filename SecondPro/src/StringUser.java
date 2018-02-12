/**
 * 
 */

/**
 * @author User
 * This class test StringBuilder Class
 */
public class StringUser {
	public static void main(String[] args) {
		
	//Initiaising the StringBuilder class with string passed via Command Line
		  StringBuilder sb = new StringBuilder(args [0]);
		  String constant = "Studying";
		   System.out.println("Given String:" + sb + "with length :" + sb.length());
		   System.out.println("First three:" + sb.substring(0,3));
		   System.out.println("Last three:" +sb.substring((sb.length()-3)));
		   int startOfConstant = sb.indexOf(constant);
		   int endOfConstant = startOfConstant + constant.length();
		   System.out.println("Print Studying:" + sb.substring(startOfConstant, endOfConstant));
		   
		   //Insert < space you nama > after"am"
		   sb.insert((sb.indexOf("am")+2), "erma");
		   System.out.println("After Insert:" +sb);
		   sb.delete(sb.indexOf("am"),sb.indexOf("am")+2);
		   System.out.println("After Delete:" +sb);
		   System.out.println("Reverse:" +sb.reverse());
		   
		   StringBuilder sb2 = new StringBuilder(args[0]);
		   System.out.println(sb == sb2);
		   StringBuilder sb3 = (sb.insert((sb.indexOf("am") +2), "erma"));
		   System.out.println(sb == sb3);
		   
		   sb = null;
		   sb2 = null;
		   sb3 = null;
		   
		   
		  
	}

}
