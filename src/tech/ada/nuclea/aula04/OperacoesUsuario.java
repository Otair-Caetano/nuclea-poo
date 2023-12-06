package tech.ada.nuclea.aula04;

import java.util.ArrayList;

public class OperacoesUsuario {

    private ArrayList<Usuario> usuariosDoBancoDeDados;

    public OperacoesUsuario() {
        this.usuariosDoBancoDeDados = new ArrayList<>();
    }

    //Implementar validação por e-mail já salvo em banco de dados,
    //caso usuário que chega como parâmetro possua o mesmo e-mail, apresentar
    //uma mensagem informando que o usuário está duplicado e não salvá-lo
    //pesquisar sobre métodos em arrayslist para fazer essa validação.
    public void salvarUsuario(Usuario usuario) {
        boolean isCadastrado = false;

        for(Usuario user : this.usuariosDoBancoDeDados) {
            if (user.getEmail().equals(usuario.getEmail())) {
                System.err.println("Usuário já cadastrado");
                isCadastrado = true;
                break;
            }
        }
        if (!isCadastrado) {
            usuariosDoBancoDeDados.add(usuario);
        }
    }

    public ArrayList<Usuario> getUsuariosDoBancoDeDados() {
        return this.usuariosDoBancoDeDados;
    }





    // Inicialização pelo setter seria ruim, pois estaríamos delegando para outra classe
    // a responsabilidade de criação do nosso banco em memória.

    /*    public void setUsuariosDoBancoDeDados(ArrayList<Usuario> usuarios) {
        this.usuariosDoBancoDeDados = usuarios;
    }*/















  /*  public void criarUsuario(Usuario usuario) {
        usuariosBancoDeDados = new ArrayList<>();
        usuariosBancoDeDados.add(usuario);
    }

    public ArrayList<Usuario> getAllUsuarios() {
        return usuariosBancoDeDados;
    }

*//*    public void setUsuariosBancoDeDados(ArrayList<Usuario> usuarios) {
        this.usuariosBancoDeDados = usuarios;
    }*//*
*/
}
