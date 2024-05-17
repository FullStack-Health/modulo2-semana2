import entidades.Calculadora;
import entidades.PressaoArterial;
import entidades.Paciente;

public class MainStatic {

    public static void main(String[] args) {
        Paciente paciente1 =new Paciente();
        Paciente paciente2 =new Paciente();
        Paciente paciente3 =new Paciente();

//        paciente1.preencherValoresScanner();
//        paciente2.preencherValoresScanner();
//        paciente3.preencherValoresScanner();

        // de certa forma Paciente com P é Classe e Objeto,
        // pois tem o código e tem atributos e métodos static
        System.out.println(Paciente.contador_pacientes_static);

//      double pode ser 10.0 ou 10d
        System.out.println(
                PressaoArterial.calculaPressao(110d,60d)
        );

        System.out.println("Resultado = "+ Calculadora.soma(10.23,14.12));
    }
}
