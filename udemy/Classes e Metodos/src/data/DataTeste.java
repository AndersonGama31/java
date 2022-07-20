package data;

public class DataTeste {

    public static void main(String[] args) {
        Data marrigeDay = new Data();
        marrigeDay.dia = "02";
        marrigeDay.mes = "Setembro";
        marrigeDay.ano = "2018";

        Data niver = new Data("23", "01", "1995");


        System.out.println("Casamento: " + marrigeDay.obterDataFormatada());

        System.out.println("Aniversario: " + niver.obterDataFormatada());
    }

}
