import entidades.Pessoa;

import java.util.ArrayList;
import java.util.List;

/*
   Uma classe ListaPessoas,
   dentro dela vamos ter um atributo private static
   List<Pessoa>, façam um método para retornar a
   lista toda e um método para adicionar itens  a lista
*/
public class ListaPessoa {

    private static List<Pessoa> pessoas = new ArrayList<>();

    public static List<Pessoa> retornaLista(){
        return pessoas;
    }

    public static void adicionaPessoa(Pessoa paciente){
        pessoas.add(paciente);
    }

}
