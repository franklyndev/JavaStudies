package heranca.polimorfismo;

public class Program {
    public static void main(String[] args){

        BusinessAccount account = new BusinessAccount();
        int n = 1;
        account.deposit(n);
        /*
        É possível criar objetos com os métodos de Account mesmo sendo
        criado a partir de outra classe BusinessAccount, pois foi herdado.
         */

    }
}
