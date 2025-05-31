import java.util.Timer;
import java.util.TimerTask;


public class BankAccountControllerTrial implements controllerInterface{

	BankAccountView view;
	Subject model;
	
	public BankAccountControllerTrial(Subject mo){
		this.model = mo;
		view = new BankAccountView(model, this);
		view.createView();
		view.desabilitarBotaoCancelar();
	}
	
	public void assinar(){
		model.registerObserver(view);
		System.out.println("Assinatura realizada na conta bancária");
		view.desabilitarBotaoAssinar();
		view.habilitarBotaoCancelar();
		final Timer timerCancela = new Timer();
		timerCancela.schedule(new TimerTask() {
	        public void run() {
	        	cancelar();
	        }
	      }, 17000);
	}
	
	public void cancelar(){
		model.removeObserver(view);
		System.out.println("Assinatura cancelada");
		view.desabilitarBotaoCancelar();
		//view.habilitarBotaoAssinar();
	}
}
