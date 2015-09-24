package lab22;

import java.util.ArrayList;
import java.util.List;

public class AddressBook{
	private List<BuddyInfo> buddyInfo;
	
	public AddressBook(){
		this.buffyInfo = new ArrayList<BuddyInfo>();
	}

	public void addBuddy(BuddyInfo aBuddyInfo){
		if(aBuddyInfo != null){
		this.buddyInfo.add(aBuddyInfo);
		}
	}
		
	
	public BuddyInfo removeBuddy(int index){
		If(index >= 0 && index < this.buddyInfo.size()){
			return this.buddyInfo.remove(index);
		}
		return null;
	}
	
	public static void main(String[] args) {
		BuddyInfo buddy = new BuddyInfo("Tom", "Carleton", 1234);
		AddressBook addressBook = new AddressBook();
		addressBook.addBuddy(buddy);
		addressBook.removeBuddy(0);
	}
	
}
