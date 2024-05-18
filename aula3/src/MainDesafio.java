import entidades.Pessoa;

public class MainDesafio {

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa();
        Pessoa pessoa3 = new Pessoa();

        // pessoa não poderia ter apenas métodos static
        // e nem apenas atributos static,
        // pois queremos ter varias pessoas diferentes
        // o static faz o atributo ter apenas um valor por classe
        pessoa.alterarNome("Camilla");
        pessoa1.alterarNome("Felippe");
        pessoa2.alterarNome("Paulo");
        pessoa3.alterarNome("Rosa");

        ListaPessoa.adicionaPessoa(pessoa);
        ListaPessoa.adicionaPessoa(pessoa1);
        ListaPessoa.adicionaPessoa(pessoa2);
        ListaPessoa.adicionaPessoa(pessoa3);

        for (Pessoa pessoaItem :
                ListaPessoa.retornaLista()) {
            System.out.println(pessoaItem.stringPessoa());
        }
    }
}
