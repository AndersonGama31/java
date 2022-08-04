package contrutores;

public enum TipoDocumento {
    //Enum => Classe que vai tipar outra Classe

        CPF {
            @Override
            public String gerarNumeroTeste(){
                return GeraCpfCnpj.cpf();
            }
        },
        CNPJ{
            @Override
            public String gerarNumeroTeste(){
                return GeraCpfCnpj.cnpj();
            }
        };
        public abstract String gerarNumeroTeste();

}
