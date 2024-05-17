import java.math.BigDecimal;
import java.math.RoundingMode;

public class MainExtra {
    public static void main(String[] args) {
//        System.out.printf("IMC: %.2f\n", 100.125); // arredonda para cima a partir do 5

        BigDecimal valor = new BigDecimal("10.129"); // objeto valor é do tipo BigDecimal
        // BigDecimal é uma classe

        //     seta a escala para 2 casas decimais, arredondamento é para cima a partir de 5
        valor = valor.setScale(2, RoundingMode.DOWN);
//        System.out.println(valor); // Resultado: 10.00


        Double resultado = 0.1 + 0.2;
        System.out.println(resultado);

        BigDecimal bigDecimal = new BigDecimal(0.1);
        System.out.println(bigDecimal.add(BigDecimal.valueOf(0.2)));
    }
}
