import java.util.ArrayList;

public class ListaPacientes {

    private static ArrayList<Paciente> pacientes;
    // 0 à N valores
    // 0 é o endereço/indice do primeiro valor
    // add gera um novo indice que estará atrelado ao valor adicionado
    // o indice é incrementado em 1

    // é uma forma de inicializar o código
    // ele executa uma vez quando a classe é carragada na memória (quando o programa começa a executar)
    static {
        // iniciando o objeto pacientes que é uma lista
        pacientes = new ArrayList<>();
    }

    // método static está atrelado a Classe Paciente
    // métodos static apenas podem chamas outros métodos static
    // se o método for de um objeto não tem problema
    public static void adicionaPaciente(Paciente paciente) {
        pacientes.add(paciente);
//        teste(); // não funciona pois não é static
    }


//    public void teste(){
//
//    }




    public static void removerPaciente(int id) { // id é o endereço na lista
        pacientes.remove(id);
    }

    public static void listarPacientes() {

        System.out.println("Id  -  Nome  -   Idade");

        // Exemplo 1 de listagem com foreach
        // para cada item da lista pacientes execute o código entre chaves
        for (Paciente paciente : pacientes) {
            // aqui o paciente existe como um variável, com os valores de cada paciente de paciente
            // indexOf retorna o id de um objeto

            System.out.println(
                    pacientes.indexOf(paciente) + "  -  " +
                    paciente.nome + "  -  " +
                    paciente.idade
            );
        }

        // Exemplo 1 de listagem com for
        for (int num = 0; num < pacientes.size(); num++) {
            System.out.println(
                    num + "  -  " +
                    pacientes.get(num).nome + "  -  " +
                    pacientes.get(num).diasCorridos + "  -  " +
                    pacientes.get(num).idade
            );

        }
    }

    public static Paciente encontrarPacienteId(int id){
        return pacientes.get(id);
    }

}
