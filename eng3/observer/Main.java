public class Main {
    public static void main(String[] args) {
        EstacaoMeteorologicaImpl estacao = new EstacaoMeteorologicaImpl();

        Celular celular1 = new Celular("Celular Alice");
        Celular celular2 = new Celular("Celular Bob");
        Painel painel1 = new Painel("Centro");
        Radio radio1 = new Radio("Rádio Cidade");

        estacao.registrarDispositivo(celular1);
        estacao.registrarDispositivo(celular2);
        estacao.registrarDispositivo(painel1);
        estacao.registrarDispositivo(radio1);

        estacao.setMudancaClima("Tempestade se aproximando!");
        estacao.setMudancaClima("Alerta de calor intenso!");

        estacao.removerDispositivo(celular2);
        estacao.removerDispositivo(radio1);

        estacao.setMudancaClima("Frente fria chegando!");
    }
}
