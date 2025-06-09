package exemplo.caneta;

public class CanetaRunner {
    public static void main(String[] args) {
        CanetaMolde canetaAzul = new CanetaMolde("bic","azul", 0.5f, true);
        canetaAzul.status();

        CanetaMolde canetaVermelha = new CanetaMolde("bic", "vermelha", 0.6f, false);
        canetaVermelha.status();
    }

}
