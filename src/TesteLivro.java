import java.time.LocalDate;

public class TesteLivro {


    public static void main(String[] args) {
        Livro[] livrosMachadosAssis = new Livro[2];

        Autor autor = new Autor("Machado de Assis",
                "Brasileiro", 140,
                livrosMachadosAssis);

        Livro livro1 = new Livro("O alienista",
                "Literatura Brasileira",
                LocalDate.of(1865, 3, 15),
                autor);

        Livro livro2 = new Livro("Dom Casmurro",
                "Literatura Brasileira",
                LocalDate.of(1899, 5, 20),
                autor);

        livrosMachadosAssis[0] = livro1;
        livrosMachadosAssis[1] = livro2;

        System.out.println(autor.livros[1].titulo);




    }


}
