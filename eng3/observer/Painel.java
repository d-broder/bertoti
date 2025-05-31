public class Painel implements DispositivoAlerta {
    private String local;

    public Painel(String local) {
        this.local = local;
    }

    @Override
    public void update(String alerta) {
        System.out.println("Painel em " + local + " exibe alerta: " + alerta);
    }
}
