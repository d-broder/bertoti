public class BankAccountController implements controllerInterface{

	BankAccountView view;
	Subject model;
	
	public BankAccountController(Subject mo){
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
	}
	
	public void cancelar(){
		model.removeObserver(view);
		System.out.println("Assinatura cancelada");
		view.desabilitarBotaoCancelar();
		view.habilitarBotaoAssinar();
	}
}
