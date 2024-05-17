import java.util.LinkedList;

public class MainLinkedList {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        list.add("primeiro");// entra no inicio da lista
        list.add("segundo");
        list.add("terceiro");

        list.addFirst("first");
        list.addLast("last");





        LinkedList<String> fila = new LinkedList<>();
        fila.addFirst("item1");
        fila.addFirst("item2");
        fila.addFirst("item3");

        System.out.println(fila);
        System.out.println("FIFO -> First In, Firt out");
        int tamanhoOriginalFila = fila.size();
        for (int i = 0; i < tamanhoOriginalFila; i++) {
            System.out.println(fila.pollLast()); //retorna -> traz o valor do ultimo item, e remove o item da fila
        }

        System.out.println("***************");


        LinkedList<String> pilha = new LinkedList<>();

        pilha.addFirst("item1");
        pilha.addFirst("item2");
        pilha.addFirst("item3");
        pilha.addFirst("item4");

        System.out.println(pilha);
        System.out.println("LIFO -> Last In, Firt out");
        int tamanhoOriginalPilha = pilha.size();
        for (int i = 0; i < tamanhoOriginalPilha; i++) {
            System.out.println(pilha.pop()); //retorna -> traz o valor do ultimo item, e remove o item da fila
        }
    }
}
