package tech.ada.nuclea.aula04;

import java.time.LocalDate;
import java.util.ArrayList;

public class TesteUsuario {

    public static void main(String[] args) {
        // Criando um usuário, esse usuario será salvo no banco de dados;.
        Usuario usuario = new Usuario("Rodolfo", "rodolfo.lima@gmail.com",
                LocalDate.of(1994, 3, 26));

        Usuario usuario2 = new Usuario("Carlos", "carlos.lima11@gmail.com",
                LocalDate.of(1994, 3, 26));

        //Instanciar a classe OperacoesUsuario que usaremos para
        // interagir com as operações de bancos de dados do usuário
        OperacoesUsuario operacoesUsuario = new OperacoesUsuario();

        //operacoesUsuario.setUsuariosDoBancoDeDados(new ArrayList<>());

        //Chamando o método responsável por adicionar um usuário no array.
        operacoesUsuario.salvarUsuario(usuario);

        operacoesUsuario.salvarUsuario(usuario2);

        ArrayList<Usuario> usuariosSalvos = operacoesUsuario.getUsuariosDoBancoDeDados();

        for(Usuario item : usuariosSalvos) {
            System.out.println("Usuário salvo no banco de dados: " + item.getNome());
        }

        /*ArrayList<Usuario> usuariosBancosDeDados = operacoesUsuario.getAllUsuarios();

        for (Usuario item : usuariosBancosDeDados) {
            System.out.println(item.getNome() + " " + item.getEmail() + " " + item.getDataNascimento());
        }*/
    }
}
