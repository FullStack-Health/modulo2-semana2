import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Paciente {

    public String nome;
    public int idade;

    public ArrayList<Integer> diasCorridos = new ArrayList<>();

    public void adicionarDia(Integer dia){
        diasCorridos.add(dia);
    }
}
