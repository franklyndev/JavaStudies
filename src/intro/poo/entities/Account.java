package intro.poo.entities;

public class Account {
    private int number;
    private String holder;
    private double balance;


    public Account(){

    }

    public Account(int number, String holder) {
        this.number = number;
        this.holder = holder;
    }

    public Account(int number, String holder, double balance){
        this.number = number;
        this.holder = holder;
        this.balance = balance;
    }

    public String getHolder() {
        return holder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double deposit){
        this.balance += deposit;
    }

    public void withdraw(double withdraw){
        this.balance -= withdraw + 2;
    }

    public String toString(){
        return "Account " + number + ", Holder: " + holder + ", Balance: $" + String.format("%.2f", balance);
    }
}
