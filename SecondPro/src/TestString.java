/**
 * 
 */

/**
 * @author User
 *
 */
public class TestString {
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
	// TODO Auto-generated method stub
	int first = 1;
	int second = 2;
	int third = 3; 
	String fourth = "C";
	String fifth = "C";
	String sixth =  new String("C");
	
	if(fourth == fifth)
		System.out.println("fourth and fifth is same : " + fourth);
	
	if(fourth == sixth)
	System.out.println("fourth and sixth is same : " + fourth);
	else

	System.out.println("fourth and sixth are not  the same:");
	
	
	/*
	System.out.println("Now fourth is:" + fourth);
	
	fourth = second + fourth;
	System.out.println("Now fourth is:" + fourth);
	
	fourth = (String.valueOf(first)).concat (fourth);
	System.out.println("Now fourth is:" + fourth);
	
	
	*/
	
	String sms ="Selamat Datang ke Malaysia!!";
	System.out.println("SMS Size is:" + sms.length());
	System.out.println("Text at 10th position / 9th index :" + sms.charAt(9));
	System.out.println("Index of the text !:" + sms.indexOf("!")); 
	System.out.println("Substring of 0 - 10:" + sms.substring (0,10));
	System.out.println("lower:" + sms.toLowerCase());
	System.out.println("UPPER:" + sms.toUpperCase());
	
	String country = "Malaysia";
	
	//if(country.equals(args[0]))){
	if(userCountry.startsWith("m")){
		System.out.println("Country is Starting with m");
	}
	
	if(userCountry.endsWith("a")){
	System.out.println("Country is ending with a");
	}
	
	if(userCountry.contains("al")){
		System.out.println("Country"+ userCountry+ " with a");
	}
	
}
	}
	

	}
}
