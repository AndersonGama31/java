package primeiroprojeto;

public class ImprimeIdade {

        public static void main(String[] args) { //Método executor
            int age = 27;
            String nome = "Anderson Gama";
            double altura = 1.90;
            double peso = 9;

            double imc = (peso) / (altura * altura);
            System.out.println("Olá :"+ nome);

            if(age >= 40) {
                if(imc < 22) {
                    System.out.println("IMC: " +imc+" sua idade é "+age+" risco de subnutrição.");
                } else if (imc<=30) {
                    System.out.println("IMC: " +imc+" sua idade é "+age+" isso aí, peso show!");
                } else if (imc<=35) {
                    System.out.println("IMC: " +imc+" sua idade é "+age+" acima do peso, cuidado!");
                }else{
                    System.out.println("IMC: " +imc+" sua idade é "+age+" risco de ataque cadíaco!");
                }
            }else{
                if(imc <= 18) {
                    System.out.println("Procure um médico para avaliação de subnutrição");
                } else if(imc <= 26) {
                    System.out.println("Seu índice está controlado e saudável procure um nutricionista");
                } else if (imc <= 32) {
                    System.out.println("Parabéns consulte um médico para medição muscular");
                } else if (imc <= 40) {
                    System.out.println("Pré obesidade precisará de um acompanhamento nutricional");
                }else{
                    System.out.println("Procure um médico endocrinologista com urgência");
                }
            }

        }
    }