import java.util.*;

public class BankAccountModel implements Subject {
	private ArrayList<Observer> observers;
	private String accountHolder;
	private String accountType;
	private double balance;
	
	public BankAccountModel() {
		observers = new ArrayList<>();
	}
	
	public void registerObserver(Observer o) {
		observers.add(o);
	}
	
	public void removeObserver(Observer o) {
		int i = observers.indexOf(o);
		if (i >= 0) {
			observers.remove(i);
		}
	}
	
	public void notifyObservers() {
		for (Observer observer : observers) {
			observer.update(accountHolder, accountType, String.valueOf(balance));
		}
	}
	
	public void accountChanged() {
		notifyObservers();
	}
	
	public void setAccountData(String accountHolder, String accountType, double balance) {
		this.accountHolder = accountHolder;
		this.accountType = accountType;
		this.balance = balance;
		accountChanged();
	}
	
	public String getAccountHolder() {
		return accountHolder;
	}
	
	public String getAccountType() {
		return accountType;
	}
	
	public double getBalance() {
		return balance;
	}
}
