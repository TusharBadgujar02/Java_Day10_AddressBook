package addressbookdemo;
import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookMain {
	
public static void main(String[] args) {
		
		System.out.println("*****Welcome to My Address Book*****");
		
		Character ch = 'a';
		Scanner sc = new Scanner(System.in);
		
		AddressBookServices create = new AddressBookServImpl();
		create.createContact();
		
		System.out.println("Created Contact  : ");
		create.displayContact();
	}

}

interface AddressBookServices {
	
	public void createContact();
	public void displayContact();
}

class AddressBookServImpl implements AddressBookServices {
	
	Scanner sc = new Scanner(System.in);
	Contacts con = new Contacts();
	
	@Override
	public void createContact() {
	
		System.out.println("Enter First Name : ");
		con.setFirstN(sc.nextLine());
		
		System.out.println("Enter Last Name : ");
		con.setLastN(sc.nextLine());
		
		System.out.println("Address : ");
		con.setAddress(sc.nextLine());
		
		System.out.println("City : ");
		con.setCity(sc.nextLine());
		
		System.out.println("State : ");
		con.setState(sc.nextLine());
		
		System.out.println("E-mail : ");
		con.setEmail(sc.nextLine());
		
	}
	
	@Override
	public void displayContact() {
		
		System.out.println("First Name : " + con.getFirstN());
		System.out.println("Last Name : " + con.getLastN());
		System.out.println("Address : " + con.getAddress());
		System.out.println("City : " + con.getCity());
		System.out.println("State : " + con.getState());
		System.out.println("E-mail : " + con.getEmail());

	}
}