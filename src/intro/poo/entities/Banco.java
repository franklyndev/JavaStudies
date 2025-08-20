package intro.poo.entities;

public class Banco {
    private int accountNumber;
    private String name;
    private double balance;

    public Banco(int accountNumber, String name, double balance) {
        this.accountNumber = accountNumber;
        this.name = name;
        deposit(balance);
    }

    // número da conta
    public Banco (int accountNumber, String name) {
        this.accountNumber = accountNumber;
        this.name = name;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getName() {
        return name;
    }

    // depositar
    public void deposit(double amount){
        this.balance += amount;
    }

    public double getBalance(){
        return balance;
    }

    public void withdraw(double amount){
        this.balance -= amount;
        this.balance -= 5;
    }

    public String toString(){
        return String.format("Account: " + "%d" + ", Holder: " + "%s" + ", Balance: $" + "%.2f", getAccountNumber(), getName(), getBalance());
    }
}