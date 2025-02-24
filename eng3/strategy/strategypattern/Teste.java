package strategypattern;

public class Teste {
	public static void main(String[] args) {

		Animal cao = new Animal();
		cao.setMovimentacao(new Voo());
		cao.movimentar();

		System.out.println("--------------------------------");

		cao.setMovimentacao(new Corrida());
		cao.movimentar();
	}

}
