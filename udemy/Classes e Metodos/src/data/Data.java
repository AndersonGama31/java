package data;

public class Data {

    String dia;
    String mes;
    String ano;

    Data() {
    dia = "1";
    mes = "1";
    ano = "1970";
    }
    Data(String diaInicial, String mesInicial, String anoInicial){
    dia = diaInicial;
    mes = mesInicial;
    ano = anoInicial;
    }


    String obterDataFormatada (){
        return (dia + "/" + mes + "/" + ano );
    }
}
