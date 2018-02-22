/**
 * 
 */

/**
 * @author User
 *
 */
public class StudentModel { 
	private String id;
	private String name;
	private String contactNo;
	private String address;
	private String email;
	
	public StudentModel() {
		
	}
	
	public StudentModel(String id, String name, String contactNo, String address, String email) {
			this.id = id;
			this.name = name;
			this.contactNo = contactNo;
			this.address = address;
			this.email = email;
			
	}

	public String getId() {
		return id;
		
	}
	
	public  void setId(String id) {
		this.id = id;
	}
		
	

	

}
