public class ContaBancoRunner {
    public static void main(String[] args) {
        ContaBanco meuBanco = new ContaBanco();
        meuBanco.conta();
        meuBanco.abrirConta();
        meuBanco.conta();
        meuBanco.depositar();
        meuBanco.conta();
        meuBanco.sacar();
        meuBanco.conta();
    }
}
