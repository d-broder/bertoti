package strategypattern;

public class Animal {
	private Movimentacao movimentacao; // aqui o polimorfismo

	public void setMovimentacao(Movimentacao movimentacao) {// argumento polimorfico
		this.movimentacao = movimentacao;
	}

	public void movimentar() {
		this.movimentacao.mover();
	}
}
