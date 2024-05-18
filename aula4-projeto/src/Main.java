import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println();
        Scanner scanner = new Scanner(System.in);
        int selecao;

        while (true) {
            System.out.println("""
                    Escolha uma ação:
                     1 - Criar novo paciente
                     2 - Remover paciente
                     3 - Listar Paciente
                     4 - Adicionar Dia Corrido
                     5 - Parar programa"""
            );
            selecao = Integer.parseInt(scanner.next());

            switch (selecao){
                case 1:
                    telaCriaPaciente(scanner);
                    continue; // parar a execução do loop e retomar novamente do começo (while(true))
                                // só funciona dentro de loop, e ele pula uma execução
                                // não afeta o switch
                case 2:
                    telaRemoverPaciente(scanner); // o método deve ser static pois o main é static
                        // um método static só pode chamar outro static
                    continue;
                case 3:
                    telaListarPacientes();
                    continue;
                case 4:
                    telaAdicionarDiaCorrido(scanner);
                    continue;

                case 5:
                    break; // sair do switch case
                default:
                    continue;
            }

            break; // break do while, ou seja ele da stop no loop, ele para o loop
        }

        scanner.close();
    }

    private static void telaAdicionarDiaCorrido(Scanner scanner) {
        System.out.println();
        System.out.println("Insira o id do paciente");

        System.out.println("Id: ");
        // encontramos e retornamos o paciente que pertence ao Id selecionado
        Paciente paciente = ListaPacientes.encontrarPacienteId(
                Integer.parseInt(
                        scanner.next()
                )
        );

        System.out.println("Numero do dia: ");
        // alteramos o objeto do paciente,
        // essa alteração irá alterar o objeto que esta aqui e na ListaPaciente também,
        // pois eles tem a mesma referencia
        paciente.diasCorridos.add(Integer.parseInt(
                scanner.next()
        ));

        // a partir daqui o objeto paciente com o id selecionado terá um novo diaCorrido salvo na memória do objeto
    }

    // estou esperando um scanner que virá de fora
    private static void telaCriaPaciente(Scanner scanner) {
        Paciente paciente = new Paciente();

        System.out.println();
        System.out.println("Crie um novo paciente");
        System.out.println();
        System.out.println("Insira os dados do paciente");

        System.out.println("Nome: ");
        paciente.nome = scanner.next();

        System.out.println("Idade: ");
        paciente.idade = Integer.parseInt(scanner.next());
        ListaPacientes.adicionaPaciente(paciente);

        telaListarPacientes();
    }

    private static void telaListarPacientes() {
        System.out.println();
        ListaPacientes.listarPacientes();
        System.out.println();
    }

    public static void telaRemoverPaciente(Scanner scanner){

        System.out.println();
        System.out.println("Deletar pacientes");
        System.out.println();

        telaListarPacientes();

        System.out.println("Digite o Id do paciente: ");

        int id = Integer.parseInt(scanner.next()); // parseInt transforma String em int, é um método static
        ListaPacientes.removerPaciente(id);
    }

}