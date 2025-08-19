package intro.poo.entities;

public class Banco {
    private int accountNumber;
    public String name;
    private double balance;

    // número da conta
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    // define saldo inicial
    public void setBalance(double balance){
        this.balance = balance;
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
        return String.format("Account: " + "%d" + ", Holder: " + "%s" + ", Balance: $" + "%.2f", accountNumber, name, getBalance());
    }
}