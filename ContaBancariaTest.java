public class ContaBancariaTest {
    public static void main(String[] args) {

        ContaBancaria myAcc = new ContaBancaria("157171153", 3000);

        myAcc.deposit(900);
        myAcc.withdraw(200);
        //acao para tentar sacar mais que o saldo
        myAcc.withdraw(5000); 
        System.out.println("__");
        System.out.println("Seu saldo eh :  " + myAcc.getBalance());
    }
}