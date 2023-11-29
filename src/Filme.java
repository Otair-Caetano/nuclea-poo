public class Filme {
    String titulo;
    String categoria;
    int censura;
    double nota;
    boolean ehCurtaMetragem;
    Ator[] elenco;
    String pais;
    String idioma;
    String diretor;

    void apresentarElenco() {
        System.out.println("Elenco do filme " + titulo + " é: ");
        for (Ator ator: elenco) {
            System.out.println("Nome ator: " + ator.nome);
        }
    }

}
