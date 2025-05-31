import java.util.List;
import java.util.ArrayList;

public class EstacaoMeteorologicaImpl implements EstacaoMeteorologica {
    private List<DispositivoAlerta> dispositivos;
    private String alertaAtual;

    public EstacaoMeteorologicaImpl() {
        dispositivos = new ArrayList<>();
    }

    @Override
    public void registrarDispositivo(DispositivoAlerta dispositivo) {
        dispositivos.add(dispositivo);
    }

    @Override
    public void removerDispositivo(DispositivoAlerta dispositivo) {
        dispositivos.remove(dispositivo);
    }

    @Override
    public void notificarDispositivos() {
        for (DispositivoAlerta dispositivo : dispositivos) {
            dispositivo.update(alertaAtual);
        }
    }

    public void setMudancaClima(String alerta) {
        this.alertaAtual = alerta;
        notificarDispositivos();
    }
}
