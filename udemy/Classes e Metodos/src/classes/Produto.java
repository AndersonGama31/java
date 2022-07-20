package classes;

public class Produto {

    String nome;
    double preco;
    double desconto;
    double precoFinal;

    double precoComDesconto(){
        return precoFinal = preco * (1 - desconto);
    }

}
