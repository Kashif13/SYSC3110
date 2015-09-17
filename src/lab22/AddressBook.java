package lab22;

import java.util.ArrayList;

public class AddressBook{
	
	private Arraylist<BuddyInfo> addressbook;
	
	public AddressBook(){
		this.addressbook = new ArrayList<BuddyInfo>();
	}

	public void addBuddy(BuddyInfo bud){
		this.addressbook.add(bud);
	}
	
	public void removeBuddy(BuddyInfo bud){
		this.addressbook.remove(bud); 
	}
	public static void main(String[] args) {
		System.out.println("Address Book");
	}
	
}
