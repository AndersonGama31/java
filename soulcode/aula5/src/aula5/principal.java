package aula5;

public class principal {
    public static void main(String[] args) {
        Aluno and = new Aluno();
        Professor bab = new Professor();


        and.setNome("Anderson");
        and.setCpf("44603733860");
        and.setCurso("Engenharia de Software");
        and.setTelefone("11981988981");
        and.setNotas(new double[]{7.6, 8.0, 10, 5.9});
        and.setEndereco("Rua das esmeraldas, 77");

        bab.setNome("Bárbara");
        bab.setCpf("42510362252");
        bab.setNomeCurso("Analise de sistemas");
        bab.setTelefone("11981988981");
        bab.setEndereco("Rua das esmeraldas, 77");
        bab.setSalario(20);


        System.out.println(bab.montaHolerite());
        System.out.println(and.montaBoletim());
    }
}
