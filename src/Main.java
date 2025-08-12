public class Main {

    public static void main(String[] args){
        System.out.println("Hello World!");
        int idade = 22;
        String nome = "Maria";
        double dinheiro = 4000.0;
        int numero = 9;
        double altura = 1.7;
        double formatnumero = 10.3578;
        System.out.println(altura);
        System.out.println(numero);
        System.out.printf("%.2f%n" ,formatnumero);
        // Juntar variáveis e letras em um print
        System.out.println("Resultado = " + numero + " pontos");
        System.out.printf("Resultado =  %.2f metros%n",formatnumero);
        // %s = Place Holder(Espaço Reservado) significa que eu reservei um local
        // para a variável, e no final formato ela em ordem, como em PY
        System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, dinheiro);

    }
}