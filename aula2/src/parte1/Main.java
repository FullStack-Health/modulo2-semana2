package parte1;// o Java é quem le o Package para realizar imports

import parte2.Pessoa;
// qual é o pacote origem da Classe e a Classe que eu quero trazer para ca
// importando o PessoaImpl para dentro de uma classe que está em outro pacote

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        List<String> lista = new ArrayList<>();
        ArrayList<String> listaArray = new ArrayList<>();

        lista.add("item");
        listaArray.add("item");

//        listaArray.trimToSize();
//        lista.trimToSize();

//        listaArray = lista;


        List<String> listaL = new LinkedList<>();
        LinkedList<String> listaLinked = new LinkedList<>();
//        listaL.get(0);
//        listaLinked.getLast();
//        listaL.getLast();


//        lista= listaLinked;
//        lista= listaArray;

        ArrayList<String> conjunto = new ArrayList<>();

        conjunto.add("item1");
        conjunto.add("item1");
        conjunto.add("item2");
        conjunto.add("item 2");
        conjunto.add("item2");
        conjunto.add("item3");

//        System.out.println(conjunto);

        HashSet<String> semDuplicatas = new HashSet<>(conjunto);
//        System.out.println(semDuplicatas);

        ArrayList<String> listaNovaSemDuplicatas = new ArrayList<>(semDuplicatas);
//        System.out.println(listaNovaSemDuplicatas);


        ////////////////////////////////////////////
        // Map

        HashMap<String, String> dicionario = new HashMap<>();
        HashMap<String, Pessoa> dicionarioPessoa = new HashMap<>();

        // Apenas as chaves precisam ser unicas,
        // os valores podem se repetir
        dicionario.put("maca","verde");
        dicionario.put("maca-verde","vermelha");
        dicionario.put("laranja","laraja");
        dicionario.put("melancia","amarela");

        Pessoa pessoa = new Pessoa();

    }
}