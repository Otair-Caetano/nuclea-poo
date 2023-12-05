package tech.ada.nuclea;

public class Autor {

    String nome;

    String nacionalidade;

    Integer idade;

    Livro[] livros;

    Autor(String nome, String nacionalidade, Integer idade, Livro[] livros) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.livros = livros;
    }
}
