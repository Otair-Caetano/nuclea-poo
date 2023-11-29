public class TesteFilme {


    public static void main(String[] args) {
        Filme osFabelmens = new Filme();
        osFabelmens.titulo = "Os Fabelmens";
        osFabelmens.categoria = "Drama";
        osFabelmens.nota = 7.5;
        osFabelmens.censura = 14;
        osFabelmens.ehCurtaMetragem  = false;
        osFabelmens.pais = "Estados Unidos";

        Ator[] elenco = new Ator[3];

        Ator ator = new Ator();
        ator.nome = "Michelle Williams";
        elenco[0] = ator;

        Ator ator2 = new Ator();
        ator2.nome = "Gabriel LaBelle";
        elenco[1] = ator2;

        Ator ator3 = new Ator();
        ator3.nome = "Paul Dano";
        elenco[2] = ator3;

        osFabelmens.elenco = elenco;

        osFabelmens.idioma = "Inglês";
        osFabelmens.diretor = "Steven Spielberg";

       // osFabelmens.apresentarElenco();


        Filme filhoDaMae = new Filme();

        System.out.println(filhoDaMae.elenco);
    }
}
