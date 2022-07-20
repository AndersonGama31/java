package aula5;

public class Aluno extends Pessoa {
    private String curso;
    private double[] notas;


    //#region Encapsulamento [Getters and Setters]

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }
    //#endregion

    private double calculaMedia(){
        double media = 0;
        for (int i = 0; i < this.notas.length; i++) {
            media+=notas[i];
        }
        return (media/notas.length);
    }

    private boolean verificaAprovacao(double media){
        if(media >= 7){
            return true;
        }else{
            return false;
        }
    }

    private boolean muitasOuPoucasNotas(){
        if(notas.length < 3 || notas.length >10 ) {
            return true;
        }else{
            return false;
        }
    }
    public String montaBoletim(){

        String boletim = "Nome do Aluno: "+ super.getNome()+ System.lineSeparator();
        if(this.verificaAprovacao(this.calculaMedia()) == false){
            boletim+=(System.lineSeparator()+"Está disponível on-line!");
        }else {
            if (this.muitasOuPoucasNotas() == true) {
                boletim += (System.lineSeparator() + "Notas abaixo ou acima do esperado");
            } else {
                boletim += (
                        "CPF: " + super.getCpf()
                                + System.lineSeparator()
                                + System.lineSeparator());
                for (int i = 0; i < this.notas.length; i++) {

                    boletim += ("avaliacao: " + this.notas[i] + " | " +
                            System.lineSeparator());
                }
                boletim += ("Resultado: Aprovado." + System.lineSeparator());
                boletim += ("Media final: " + this.calculaMedia() + System.lineSeparator());

            }
        }
        return boletim;
    }
}
