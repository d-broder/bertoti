public interface EstacaoMeteorologica {
    void registrarDispositivo(DispositivoAlerta dispositivo);

    void removerDispositivo(DispositivoAlerta dispositivo);

    void notificarDispositivos();
}
