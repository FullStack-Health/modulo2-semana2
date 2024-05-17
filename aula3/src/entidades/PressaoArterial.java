package entidades;

public class PressaoArterial {

    public static String calculaPressao(Double valorMedicaoSis, Double valorMedicaoDias) {
        if (valorMedicaoSis >= 90 && valorMedicaoSis <= 120 &&
                valorMedicaoDias >= 60 && valorMedicaoDias <= 80) {
            return "Pessoa Saudavel";
        }
        return "Pessoa está mal";
    }
}
