package entidades; // pacote que identifica o local dessa Classe dentro do src

public class Pessoa {

    private String nome;
    private double peso;
    private int idade = 10;

    public String stringPessoa(){
        return "Nome: " + nome +
                "\nPeso: " + peso +
                "\nIdade: " + idade;
    }
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
