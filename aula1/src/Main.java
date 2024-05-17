import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] listaNumeros = new int[10]; // lista de primitivos
        // imutável
        // aloca/reserva 10 numeros inteiros na memória (32bits * 10 -> 320 bits de memória)
        // todos os inteiros começam com 0 de valor


    // Tipo do Objeto                Implementação
    // métodos e atributos           código dos métodos
        // pode começar com 10 bits e ir até 10000 bits ou mais
        // depende da memória limite do java para objetos



        ArrayList<String> listaOriginal = new ArrayList(); // Lista de String
        // Lista mutável de objetos
        // ela tem um começo, porém o final da memória é flexivel
        // Sempre usar objetos para a lista (String, Long, Integer)
        // Ele tem um size, que é tamanho da lista
        // adicionar ou remover itens pelo id
        // podemos buscar itens pelo id

        // salva os itens na ordem de entrada
        listaOriginal.add("André3"); // index = 0 -> sempre começa do zero
        listaOriginal.add("André1"); // index = 1
        listaOriginal.add("André2"); // index = 2
        listaOriginal.add("Felipe"); // index = 3
        listaOriginal.add("Heitor"); // index = 4

//        System.out.println(lista);

        listaOriginal.remove(2);

//        System.out.println(lista);

//        System.out.println(lista.get(1));

        listaOriginal.add("Item 5");

        // a sublista vai do 2 até um item antes do indice 5
        // ele retorna uma List
        List<String> subLista = listaOriginal.subList(2,5); // fatia a lista do item 1 ao 2 e muda a lista original

        System.out.println(subLista);

        ArrayList<String> listaTransformada = new ArrayList(subLista);

        listaTransformada.addAll(listaOriginal); // adicionei todos os item de lista ao final de listaTransformada
        System.out.println(listaTransformada);

        listaTransformada.add("Item novo");
        listaTransformada.removeAll(listaOriginal);
            // remove todos os item de uma lista de referencia
            // remover todas as ocorrencias de um item da lista de referencia

        System.out.println(listaTransformada);

        System.out.println(listaOriginal);
        listaOriginal.add(3,"Nova String"); // adiciona um novo item, realocando os demais para frente
        System.out.println(listaOriginal);



        // Classe   objeto
    //(codigo)  (execucao)
        Scanner scanner = new Scanner(System.in);








//        String nome = "Andre";
//
//        nome = null; // null é a ausencia de valores
//        System.out.println(nome);
    }
}