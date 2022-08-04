package contrutores;

public class servico {

    public static void main(String[] args) {
        Pessoa pFisica = new Pessoa();

        pFisica.setTipoDocumento(Enum.valueOf(TipoDocumento.class,"CPF"));
        pFisica.setNumeroDocumento(pFisica.getTipoDocumento().gerarNumeroTeste());
        System.out.println(pFisica);

        Pessoa pJuridica = new Pessoa();

        pJuridica.setTipoDocumento(Enum.valueOf(TipoDocumento.class,"CNJP"));
        pJuridica.setNumeroDocumento(pJuridica.getTipoDocumento().gerarNumeroTeste());
        System.out.println(pJuridica);
    }
}
