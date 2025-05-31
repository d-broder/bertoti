public class Celular implements DispositivoAlerta {
    private String nome;

    public Celular(String nome) {
        this.nome = nome;
    }

    @Override
    public void update(String alerta) {
        System.out.println(nome + " recebeu alerta no celular: " + alerta);
    }
}
