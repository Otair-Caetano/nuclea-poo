package tech.ada.nuclea.aula04;

import java.time.LocalDate;

public class Usuario {

    private String nome;

    private String email;

    private LocalDate dataNascimento;

    public Usuario(String nome, String email, LocalDate dataNascimento) {
        this.nome = nome;
        this.email = email;
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return this.nome;
    }

    public String getEmail() {
        return this.email;
    }

    public LocalDate getDataNascimento() {
        return this.dataNascimento;
    }


    public boolean equals(Object object) {
        return ((Usuario) object).getEmail().equals(this.email);
    }

}
