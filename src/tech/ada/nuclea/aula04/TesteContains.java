package tech.ada.nuclea.aula04;

import java.time.LocalDate;
import java.util.ArrayList;

public class TesteContains {


    public static void main(String[] args) {

        ArrayList<Integer> listaInteiros = new ArrayList<>();

        listaInteiros.add(1);
        listaInteiros.add(2);
        listaInteiros.add(3);

        boolean resultadoContains = listaInteiros.contains(4);

        //System.out.println(resultadoContains);

        ArrayList<Usuario> listaUsuario = new ArrayList<>();

        Usuario usuario1 = new Usuario("Carlos", "carlos@gmail.com", LocalDate.now());
        Usuario usuario2 = new Usuario("Rodolfo", "rodolfo@gmail.com", LocalDate.now());

        Usuario usuario3 = new Usuario("Carlos", "carlos@gmail.com", LocalDate.now());

        listaUsuario.add(usuario1);
        listaUsuario.add(usuario2);

        boolean retornoContainsLista = listaUsuario.contains(usuario3);

        System.out.println(retornoContainsLista);
    }
}
