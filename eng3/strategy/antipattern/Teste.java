package antipattern;

public class Teste {
	public static void main(String[] args) {
		Animal passaro = new Passaro();
		passaro.movimentar();

		System.out.println("--------------------------------");

		Animal cachorro = new Cachorro();
		cachorro.movimentar();
	}
}