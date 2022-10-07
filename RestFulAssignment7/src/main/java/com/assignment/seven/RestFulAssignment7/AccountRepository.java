package com.assignment.seven.RestFulAssignment7;

import java.util.ArrayList;
import java.util.List;

public class AccountRepository {
	List<Account> ac;

	public AccountRepository(){
			ac = new ArrayList<>();
		
		Account a = new Account();
		a.setAcno(48562548);
		a.setName("bani");
		a.setActype("saving");
		a.setBalance(500000);
		
		Account a1 = new Account();
		a1.setAcno(56325331);
		a1.setName("risha");
		a1.setActype("current");
		a1.setBalance(80000);
		
		ac.add(a);
		ac.add(a1);
	}

	public List<Account> getDetails()
	{
		return ac;
	}
	
	public Account deposite(int amt){
			
			for(Account c : ac)
			{
				
			int b =  c.getBalance() - amt;
			}
			return new Account();
		}
	
	
	public int withdraw(int amt){
			
			for(Account n : ac)
			{
				int m = n.getBalance();
				if(n.getBalance() >= amt){
					m = m - amt;
				}
			
			}
			int m = 0;
			return m;
		}
	
	public int balance(){
		
		return  ((Account) ac).getBalance();
	}

	
}
