package parte2;

import java.util.ArrayList;
import java.util.Scanner;

// Classe começa com maiusculo e cada palavra é separada por maiusculo -> PascalCase
public class MainParte2 {
    public static void main(String[] args) {
        Carro carro = new Carro(); // classes no mesmo pacote não precisam de import
        //o import junta pacotes -> Busca em outro pacote uam classe
        // podemos pensar que cada pacote é um país, compra nacional não tem importação

        // criei um representação de pessoa => abstração de pessoa
        // abstração é representar alguma coisa de forma resumida

        Pessoa pessoa0 = new Pessoa(); // nova pessoa, objeto de Pessoa(classe)
        Pessoa pessoa1 = new Pessoa();

        pessoa0.alterarNome("Mateus"); // pessoa0 é o this lá no Pessoa
        pessoa0.alterarPeso(77.8); // pessoa0 é o this lá no Pessoa
        pessoa0.alterarIdade(26); // pessoa0 é o this lá no Pessoa
        pessoa1.alterarNome("André"); // pessoa1 é o this lá no Pessoa

        System.out.println(
                "Pessoa 0: \n" +pessoa0.stringPessoa() // executa um código que está criado na classe Pessoa
        );

        System.out.println(pessoa0);

        System.out.println("*********");

        System.out.println(
                "Pessoa 1: \n" +pessoa1.stringPessoa() // executa um código que está criado na classe Pessoa
        );
        System.out.println(pessoa1);

//        Scanner scanner = new Scanner(System.in);
//        scanner.next(); // método/comportamento

        Pessoa pessoaNova = new Pessoa();

        System.out.println("Pessoa Nova " + pessoaNova);

        pessoaNova = pessoa0;

        System.out.println("Pessoa Nova " + pessoaNova);

        pessoaNova.alterarIdade(77);

        System.out.println(
                "Pessoa N: \n" +pessoaNova.stringPessoa() // executa um código que está criado na classe Pessoa
        );

        System.out.println(
                "Pessoa 0: \n" +pessoa0.stringPessoa() // executa um código que está criado na classe Pessoa
        );


        ArrayList<Pessoa> pessoas = new ArrayList<>();



    }


}
