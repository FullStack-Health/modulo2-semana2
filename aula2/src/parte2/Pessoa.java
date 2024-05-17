package parte2; // pacote que identifica o local dessa Classe dentro do src

public class Pessoa {

    // atributos de uma Pessoa, ou seja são caracteristicas
    private String nome;
    // private adiciona o encapsulamento, que é restringir outras classes de acessarem os atributos dessa classe
    // a palavra private faz com que o atributo nome exista apenas dentro da classe Pessoa
    // no encapsulamento eu fecho os atributos, mas posso alterá-los por métodos

    private double peso; //atributos primitivos tem um valor padrão
    private int idade = 10; // se a idade não for informada, ela vai ser 10 por padrão

    public String stringPessoa(){
        return "Nome: " + nome +
                "\nPeso: " + peso +
                "\nIdade: " + idade;
    }

    // métodos tem de 4 a 5 partes
        // public -> Acessivel por todos os métodos do código
        // void -> tipo de retorno, no caso ele não tem retorno algum
        // alterarNome -> nome do método
        // (String nome) -> paramentros -> entradas do método
    public void alterarNome(String nome){
        this.nome = nome;
    }

    public void alterarPeso(double peso){
        this.peso = peso;
    }

    public void alterarIdade(int idade){
        this.idade = idade;
    }

}
