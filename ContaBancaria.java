public class ContaBancaria {
    private String numAcc;
    private double balance;

    public ContaBancaria(String numAcc, double initialBalance) {
        this.numAcc = numAcc;
        this.balance = initialBalance;
    }

    public void deposit(double value) {
        balance+=value;
        System.out.println("Seu deposito no valor de:  " + value + " foi realizado com SUCESSO :)");
    }

    public void withdraw(double value) {
        if (value > balance) {
            System.out.println("Saldo insuficiente :(");
        } else {
            balance-=value;
            System.out.println("Seu saque no valor de : " + value + " foi realizado com SUCESSO :)");
        }
    }

    public double getBalance() {
        return balance;
    }
}