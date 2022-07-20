package aula4;

public class programa {

    public static void main(String[] args) {

        Carro van = new Carro();
        van.marca = "Toyota";
        van.modelo = "Hiace";
        van.capacidadeFuel = 76;
        van.numPassageiro = 10;
        van.consumoFuel = 10.2;
        van.tipoFuel = "gasolina";

        Carro fusca = new Carro();
        fusca.marca = "Volkswagen";
        fusca.modelo = "fusca";
        fusca.capacidadeFuel = 42;
        fusca.numPassageiro = 4;
        fusca.consumoFuel = 8.6;
        van.tipoFuel = "diesel";

        Aeronave boing = new Aeronave();
        boing.tripulacao = 5;
        boing.numPassageiro = 250;
        boing.modelo = "a5412-voa-mesmo";
        boing.capacidadeFuel = 2500;
        boing.consumoFuel = 25;

        System.out.println("-------------Impressao do Objeto-------------");
        System.out.println(van);
        System.out.println("Modelo: " + van.modelo + "  |  Autonomia: " + van.calculaAutonomia());
        System.out.println("Eco taxa: " + van.verificarDesempenho());
        if (van.validaEcoDesempenho(105) == true) {
            System.out.println("Eco eficiente.");
        } else {
            System.out.println("Nao e Eco Eficiente.");
        }
        System.out.println("-------------Impressao do Objeto-------------");
        System.out.println(fusca);
        System.out.println("Modelo: " + fusca.modelo + "  |  Autonomia: " + fusca.calculaAutonomia());
        System.out.println("Eco taxa: " + fusca.verificarDesempenho());
        if (van.validaEcoDesempenho(105) == true) {
            System.out.println("Eco eficiente.");
        } else {
            System.out.println("Nao e Eco Eficiente.");
        }

        System.out.println("-------------[Exercicio aeronave]--------------");
        System.out.println(boing);
        System.out.println("Modelo: " + boing.modelo + "  |  Autonomia: " + boing.calculaAutonomia());
        System.out.println("Eco taxa: " + boing.verificarDesempenho());
        if (van.validaEcoDesempenho(200) == true) {
            System.out.println("Voa bem, baixo consumo.");
        } else {
            System.out.println("Não voa bem, alto consumo");
        }
    }


}
