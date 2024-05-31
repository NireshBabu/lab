package boi.com;
import java.util.*;
class Account
{
	String name="Rajesh";
	int AcNo=12345;
	int balance=9000;
	public void display()
	{
		System.out.println("\n Emp Name : "+name+"\n Ac No: "+AcNo+"\n Available Balance : "+balance);
	}
}
class Loanaccount extends Account
{
	int loanamt=1000;
	public void displayloan()
	{
		int Availablebal=balance-loanamt;
		System.out.println("\n My Balance is "+Availablebal);
		
	}
	
}
public class SimpleInheritance 
{
	public static void main(String[] args) 
	{
		Loanaccount obj=new Loanaccount();
		obj.display();
		obj.displayloan();
	}

}
