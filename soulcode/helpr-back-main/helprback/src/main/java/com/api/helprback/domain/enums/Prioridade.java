package com.api.helprback.domain.enums;

public enum Prioridade {
    BAIXA(0, "BAIXA"), MEDIA(1, "MEDIA"), ALTA(2, "ALTA");

    private Integer codigo;
    private String descricao;

    Prioridade(Integer codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public static Prioridade toEnum(Integer cod){
        if(cod == null){
            return null;
        }

        for (Prioridade x: Prioridade.values()) {
            if(cod.equals(x.getCodigo())){
                return x;
            }
        }
        throw new IllegalArgumentException("Prioridade inválida");


    }

    public enum Perfil {
        ADMIN(0, "ROLE_ADMIN"), CLIENTE(1, "ROLE_CLIENTE"), TECNICO(2, "ROLE_TECNICO");

        private Integer codigo;
        private String descricao;

        Perfil(Integer codigo, String descricao) {
            this.codigo = codigo;
            this.descricao = descricao;
        }

        public Integer getCodigo() {
            return codigo;
        }

        public String getDescricao() {
            return descricao;
        }

        public static Perfil toEnum(Integer cod){
            if(cod == null){
                return null;
            }

            for (Perfil x: Perfil.values()) {
                if(cod.equals(x.getCodigo())){
                    return x;
                }
            }
            throw new IllegalArgumentException("Perfil inválido");


        }
    }
}
