import java.util.Timer;
import java.util.TimerTask;

public class BankSystem {

	public static void main(String[] args) {
		final BankAccountModel model = new BankAccountModel();
		new BankAccountController(model);

		final Timer timer = new Timer();
		timer.schedule(new TimerTask() {
			public void run() {
				model.setAccountData("João Silva", "Corrente", 1500.00);
			}
		}, 5000);

		final Timer timer2 = new Timer();
		timer2.schedule(new TimerTask() {
			public void run() {
				model.setAccountData("Maria Aparecida", "Poupança", 1200.00);
			}
		}, 10000);
	}
}
