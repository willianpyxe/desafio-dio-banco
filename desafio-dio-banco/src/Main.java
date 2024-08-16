public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();
        Cliente cliente1 = new Cliente();
        cliente1.setNome("Alice");

        Conta cc = new ContaCorrente();
        Conta poupanca = new ContaPoupanca();

        cc.setCliente(cliente1);
        poupanca.setCliente(cliente1);

        cliente1.adicionarConta(cc);
        cliente1.adicionarConta(poupanca);

        banco.adicionarConta(cc);
        banco.adicionarConta(poupanca);

        cc.depositar(100);
        cc.transferir(100, poupanca);

        banco.listarContas();
    }
}
