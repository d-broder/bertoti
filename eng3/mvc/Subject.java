public interface Subject {
	public void registerObserver(Observer o);

	public void removeObserver(Observer o);

	public void notifyObservers();

	public void setAccountData(String accountHolder, String accountType, double balance);
}
