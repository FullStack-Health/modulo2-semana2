package entidades;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Paciente {

    public String nome;
    public int idade;
    public double altura;
    public double peso;
    public List<String> historicoMedico;

    public static long contador_pacientes_static;
    // O contador_pacientes_static pertece a Classe Paciente
    // Não precisa de um objeto para ser preenchido e sempre que for
    // usado em um objeto ele "vaza" para a Classe
    // não pertence ao this -> ou seja, não pertence aos objetos dessa Classe


    public long contadorPacientesNormal;
    // esse contador é do objeto, por isso a cada new Paciente ele reseta, pois é um contador novo


    public void preencherValoresScanner() {
        contador_pacientes_static++;
        contadorPacientesNormal++;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nome : ");
        this.nome = scanner.next();

        System.out.println("Idade : ");
        this.idade = scanner.nextInt();

        System.out.println("Altura : ");
        this.altura = scanner.nextDouble();

        System.out.println("Peso : ");
        this.peso = scanner.nextDouble();

        this.historicoMedico = new ArrayList<>();

        System.out.println("Contador Pacientes =" + contador_pacientes_static);
        System.out.println("Contador Normal =" + contadorPacientesNormal);
    }


    public double calculaImc() {
        return this.peso / (this.altura * this.altura);
    }

    // parametros
    // tipo e nome, o nome é unico, mas pode ser igual ao nome de um atributo
    // a ordem dos parametros importa, porque eles serão preenchidos em or
    public double calculaImcExterno(double peso, double altura) {
        return peso / (altura * altura);
    }

}
