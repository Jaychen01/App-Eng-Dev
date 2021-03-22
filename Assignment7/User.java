package Assignment7;

import java.util.ArrayList;

public class User {
		
	private String name;
	private int age;
	private String address;
	private String phoneNumber;
	private String bankAccountNumber;
				
	public User(String name, int age, String address, String phoneNumber, String bankAccountNumber) {
		this.name = name;
		this.age = age;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.bankAccountNumber = bankAccountNumber;		
	}
	
	public User() {
		
	}
			
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getBankAccountNumber() {
		return bankAccountNumber;
	}

	public void setBankAccountNumber(String bankAccountNumber) {
		this.bankAccountNumber = bankAccountNumber;
	}	
}


class UserData{
	
	private String password;
	private double availableBalance;
	private ArrayList<String> transactionList=new ArrayList<String>();
	User user;	
	
	public UserData(String password, double availableBalance, ArrayList<String> transactionList, User user) {		
		this.password = password;
		this.availableBalance = availableBalance;
		this.transactionList = transactionList;
		this.user = user;
	}
	
	public UserData() {
		
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public double getAvailableBalance() {
		return availableBalance;
	}
	public void setAvailableBalance(double availableBalance) {
		this.availableBalance = availableBalance;
	}
	public ArrayList<String> getTransactionList() {
		return transactionList;
	}
	public void setTransactionList(ArrayList<String> transactionList) {
		this.transactionList = transactionList;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}

}


	