
public class BuddyInfo {
	
	
	private String name;
	private String address;
	private String phonenumber;
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getPhonenumber() {
		return phonenumber;
	}


	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}


	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BuddyInfo b = new BuddyInfo();
		
		
		b.setName("Darth Vader");
		b.setAddress("Death Star");
		b.setPhonenumber("1-343-666-7777");
		
		System.out.println("Hello " + b.getName());
		

	}

}
