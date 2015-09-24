package lab22;
public class BuddyInfo {
	
	
	private String name;
	private String address;
	private int phonenumber;
	
	public BuddyInfo(String name, String address, int phonenumber){
	this.name = name;
	this.address = address;
	this.phonenumber = phonenumber;
	}
	
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


	public int getPhonenumber() {
		return phonenumber;
	}


	public void setPhonenumber(int phonenumber) {
		this.phonenumber = phonenumber;
	}


	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BuddyInfo b = new BuddyInfo("Kash","avenue", 112);
		
		
		System.out.println("Hello " + b.getName());
		

	}

}
