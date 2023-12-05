package tech.ada.nuclea;

import java.time.LocalDate;

public class Livro {

    String titulo;

    String genero;

    LocalDate dataPublicacao;

    Autor autor;

    Livro(String titulo,
          String genero,
          LocalDate dataPublicacao,
          Autor autor) {
        this.titulo = titulo;
        this.genero = genero;
        this.dataPublicacao = dataPublicacao;
        this.autor = autor;
    }

}
