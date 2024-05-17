import entidades.Paciente;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");

        Paciente paciente = new Paciente();

        paciente.nome = "Paciente";

        paciente.altura = 1.8;
        paciente.peso = 80;
        paciente.idade = 27;

        List<String> historicoMedico = new ArrayList<>();
        historicoMedico.add("Dor de cabeça cronica");
        historicoMedico.addAll(
                List.of("Vacinado",
                        "Problema de joelho")
        );

    // objeto paciente -> objeto lista -> adicionar itens ao objeto lista dentro do objeto paciente
        paciente.historicoMedico = historicoMedico; // eu trato o historicoMedico como uma List

        System.out.println(paciente.nome);

        Paciente paciente1 = new Paciente();

        paciente1.preencherValoresScanner();
        System.out.println(paciente1.nome);


    }

    static class Medico {
        public String nomeMedico;
    }

}