package Assignment7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Atm {
	
	private double availableAmountInMachine;
	private double transactionFee;
	private HashMap<String,UserData> userData = new HashMap<String, UserData>();
	
	public Atm(double availableAmountInMachine, double transactionFee, HashMap<String, UserData> userData) {
		this.availableAmountInMachine = availableAmountInMachine;
		this.transactionFee = transactionFee;
		this.userData = userData;
	}
	
	public Atm() {
		
	}	
		
	private void start() {		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);		
		System.out.println("Welcome to XX Bank!");
		System.out.println("Please Select 1.New User 2.Current User");
		switch(input.nextInt()) {
		case 1:
			createNewUser();
			break;
		case 2:
			login();
			break;
		default:
			System.out.println("Please Select the right number");
			start();
		}		
	}

	private void createNewUser() {
		String str = generateBankAccountNumber();
		System.out.println("Your New Account Number is:"+str);
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);		
		String password1, password2;
		do {
			System.out.println("Please Enter Your Password");
			password1 = input.nextLine();
			System.out.println("Please Enter Your Password again");
			password2 = input.nextLine();
			}while(!password1.equals(password2));
		
		if(password1.equals(password2)) {
			User u = new User();
			UserData data = new UserData();		
			u.setBankAccountNumber(str);
			data.setPassword(password1);
			data.setUser(u);
			userData.put(str,data);		
		}
		start();
	}
	
	private String generateBankAccountNumber() {
		String accountNumber = "";
		Random r = new Random();		
		for (int i = 0; i<12; i++) {
			accountNumber += r.nextInt(10);
		}	
		if(userData != null && userData.keySet().contains(accountNumber)){
		this.generateBankAccountNumber();		
		}
		return accountNumber;
	}	
	
	String accountNum = "";
	private void login() {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("Please Enter Account Number");
		String num = input.nextLine();
		if(userData.keySet().contains(num)){
			accountNum = num;
			System.out.println("Please Select 1.Enter Password 2.Forget Password");
			int n = input.nextInt();
			switch(n) {
			case 1:
				System.out.println("Please Enter Password");
				Scanner input2 = new Scanner(System.in);
				String code = input2.nextLine();					
				if(userData.get(num).getPassword().equals(code)){
					System.out.println("Sign In Successfully");					
					showMeun();
				}
				else {
					System.out.println("Password is Wrong");		
				}
				break;
			case 2:
				System.out.println("Reset Password");
				resetPassword();
				break;
			default:
				start();
				break;
			}
		}
		else {	
		System.out.println("Account Number is Wrong");		
		start();
		}		
	}

	private void resetPassword(){
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("Please Enter Name");
		String name = input.nextLine();	
		System.out.println("Please Enter Age");
		int age = Integer.parseInt(input.nextLine());
		System.out.println("Please Enter Phone Number");
		String phoneNum = input.nextLine();
		int a = userData.get(accountNum).getUser().getAge();
		String nm = userData.get(accountNum).getUser().getName();
		String ph = userData.get(accountNum).getUser().getPhoneNumber();
		
		if(name.equals(nm) && age == a && phoneNum.equals(ph)) {		
				String password1, password2;
				do {
				System.out.println("Please Enter New Password");
			
				password1 = input.nextLine();
				System.out.println("Please Enter New Password again");
				password2 = input.nextLine();
				}while(!password1.equals(password2));
				if(password1.equals(password2)) {
					System.out.println("Reset Password Successfully");
					userData.get(accountNum).setPassword(password1);
				}	
		}else {
			System.out.println("Wrong Information");
			
		}login();	
	}

	private void showMeun() {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("Please Select 1.WithDrawal 2.Deposit 3.QueryRecentTransactions 4.ChangePassword 5 QueryBalance 6 Exit");
		int i = 0;
		try {
			i = input.nextInt();
		}catch(NumberFormatException e) {
			System.out.println("Please Seclect the right number");
			start();
		}
		switch(i) {
		case 1:
			withdraw();
			break;
		case 2:
			deposit();
			break;
		case 3:
			queryRecentTransactions();
			break;
		case 4:
			changePassword();
			break;
		case 5:
			queryBalance();
			break;
		case 6:
			exit();
			break;	
		default:
			System.out.println("The Entered Number is Wrong");
			login();
			break;
		}
	}

	private void withdraw() {
		System.out.println("How much do you want to withdraw?");		
		@SuppressWarnings("resource")		
		Scanner input = new Scanner(System.in);	
		int money =  Integer.parseInt(input.nextLine());
		double tmp = userData.get(accountNum).getAvailableBalance();
		if(money > 0 && money <= tmp && money <= availableAmountInMachine) {
			availableAmountInMachine -= money;					
			tmp = tmp - money - transactionFee;	
			userData.get(accountNum).setAvailableBalance(tmp);
			userData.get(accountNum).getTransactionList().add("withdrawal-"+money);
			System.out.println("Withdraw Successfully! "+"withdraw "+money+" transaction fee: "+ transactionFee);			
		}else {
			System.out.println("Withdraw Failure");
			
		}showMeun();
	}
	
	private void deposit() {
		System.out.println("How much do you want to deposit?");
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int money = input.nextInt();
		if(money > 0) {			
			System.out.println("Deposit " + money +", Transaction Fee will be " + transactionFee);
			System.out.println("Please Select 1 YES 2 NO");
			if(input.nextInt() == 1) {			
				availableAmountInMachine += money;		
				double tmp = userData.get(accountNum).getAvailableBalance();				
				tmp = tmp + money - transactionFee;	
				userData.get(accountNum).setAvailableBalance(tmp);
				userData.get(accountNum).getTransactionList().add("deposit-"+money);
				System.out.println("Deposit Successfully");							
			}else {
				System.out.println("Deposit Failure");				
			}
		}else{
			System.out.println("Deposit Failure");		
		}showMeun();
	}
	
	private void queryRecentTransactions() {
		System.out.println("the most recent 10 transactions is ");
		ArrayList<String> str = userData.get(accountNum).getTransactionList();
		int s = str.size();	
		for(int i = s-1; i>=(s>10?s-10:0); i--) {
			System.out.println(str.get(i));
		}
		showMeun();
	}

	private void changePassword() {
		System.out.println("Please Enter Current Password");
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);	
		String code = input.nextLine();		 
		if(code.equals(userData.get(accountNum).getPassword())) {
			String password1, password2;
			do {
			System.out.println("Please Enter New Password");
			password1 = input.nextLine();
			System.out.println("Please Enter New Password again");
			password2 = input.nextLine();
			}while(!password1.equals(password2));
			if(password1.equals(password2)) {
				System.out.println("Change Password Successfully");
				userData.get(accountNum).setPassword(password1);
			}	
		}else {
			System.out.println("Password is Wrong");
			
		}login();
	}						

	private void queryBalance() {	
		System.out.println("Your Available Balance is " + userData.get(accountNum).getAvailableBalance());
		showMeun();
	}

	private void exit() {
		System.out.println("End");
		accountNum = "";
		start();
	}	
	
	public static void main(String[] arge) {			
	
		User u = new User("kk",18,"seattle","1234567890","123456789012");
		ArrayList<String> str = new ArrayList<>();
		UserData d = new UserData("1111",100.00,str,u);
		HashMap<String, UserData> hm =new HashMap<String, UserData>();
		hm.put(u.getBankAccountNumber(), d);
		Atm a = new Atm(1000.00,1.00,hm);
		a.start();

	}
}
