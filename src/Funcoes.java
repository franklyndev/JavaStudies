import java.util.Scanner;

public class Funcoes {
    /*
        Aqui aprendi a criar funções que retornam valor e que não retornam um valor e sim uma ação
     */
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int higher = max(a, b, c);

        showResult(higher);

        sc.close();
    }
    /*
        Método com retorno (int, String, etc.) → sempre devolve um valor do tipo indicado.
        Serve quando você precisa calcular algo e usar esse resultado em outra parte do programa.
     */
    public static int max(int x, int y, int z){
        if (x > y && x > z){
            return x;
        } else if (y > z) {
            return y;
        } else {
            return z;
        }
    }
    /*
        Função void → não devolve valor nenhum, apenas executa uma ação
        (como mostrar uma mensagem, salvar dados, etc.).
     */

    public static void showResult(int value){
        System.out.println("Higher = " + value);
    }
}
