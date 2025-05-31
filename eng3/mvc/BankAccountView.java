import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class BankAccountView implements ActionListener, Observer {
	private controllerInterface controller;
	private String accountHolder = "";
	private String accountType = "";
	private String balance = "0.00";

	JFrame frame;
	JPanel panelBotoes;
	JPanel panelDados;
	JPanel panelHolder;
	JPanel panelType;
	JPanel panelBalance;
	JLabel labelHolder;
	JLabel labelType;
	JLabel labelBalance;
	JLabel holderText;
	JLabel typeText;
	JLabel balanceText;
	JButton subscribe;
	JButton unsubscribe;

	public BankAccountView(Subject mo, controllerInterface co) {
		this.controller = co;
	}

	public void createView() {

		frame = new JFrame("Sistema Bancário");
		panelBotoes = new JPanel();
		panelDados = new JPanel();
		panelHolder = new JPanel();
		panelType = new JPanel();
		panelBalance = new JPanel();
		subscribe = new JButton("Assinar Conta");
		unsubscribe = new JButton("Cancelar Assinatura");
		labelHolder = new JLabel();
		labelType = new JLabel();
		labelBalance = new JLabel();
		holderText = new JLabel("Titular");
		typeText = new JLabel("Tipo de Conta");
		balanceText = new JLabel("Saldo");

		subscribe.addActionListener(this);
		unsubscribe.addActionListener(this);

		panelBotoes.add(subscribe);
		panelBotoes.add(unsubscribe);
		panelHolder.add(holderText);
		panelHolder.add(labelHolder);
		panelType.add(typeText);
		panelType.add(labelType);
		panelBalance.add(balanceText);
		panelBalance.add(labelBalance);
		panelDados.add(panelHolder);
		panelDados.add(panelType);
		panelDados.add(panelBalance);
		frame.getContentPane().add(BorderLayout.SOUTH, panelBotoes);
		frame.getContentPane().add(BorderLayout.CENTER, panelDados);

		labelHolder.setText(accountHolder);
		labelType.setText(accountType);
		labelBalance.setText(balance);

		frame.setSize(300, 150);
		frame.setVisible(true);

	}

	public void update(String holder, String type, String bal) {
		accountHolder = holder;
		accountType = type;
		balance = bal;

		display();
	}

	public void display() {

		labelHolder.setText(accountHolder);
		labelType.setText(accountType);
		labelBalance.setText(balance);

	}

	public void habilitarBotaoAssinar() {

		subscribe.setEnabled(true);

	}

	public void desabilitarBotaoAssinar() {

		subscribe.setEnabled(false);

	}

	public void habilitarBotaoCancelar() {

		unsubscribe.setEnabled(true);

	}

	public void desabilitarBotaoCancelar() {

		unsubscribe.setEnabled(false);

	}

	public void actionPerformed(ActionEvent event) {
		if (event.getSource() == subscribe) {
			controller.assinar();
		}
		if (event.getSource() == unsubscribe) {
			controller.cancelar();
		}
	}
}
