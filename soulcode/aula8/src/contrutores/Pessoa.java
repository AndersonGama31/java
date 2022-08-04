package contrutores;

public class Pessoa {
    private TipoDocumento tipoDocumento;
    private String numeroDocumento;

    //#region Contrutores

    public Pessoa(TipoDocumento tipoDocumento, String numeroDocumento){
        super();
        this.tipoDocumento = tipoDocumento;
        this.numeroDocumento = numeroDocumento;
    }
    public Pessoa(){
        super();
    }
    //endregion

    //#region Encapsuladores


    public TipoDocumento getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(TipoDocumento tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }
    //endregion

    //#region Notação de String

    @Override
    public String toString() {
        return "Pessoa{" +
                "tipoDocumento=" + tipoDocumento +
                ", numeroDocumento='" + numeroDocumento + '\'' +
                '}';
    }
    //#endregion

}
