public class Radio implements DispositivoAlerta {
    private String estacao;

    public Radio(String estacao) {
        this.estacao = estacao;
    }

    @Override
    public void update(String alerta) {
        System.out.println("Rádio " + estacao + " transmite alerta: " + alerta);
    }
}
