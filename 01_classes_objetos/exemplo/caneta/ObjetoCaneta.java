package exemplo.caneta;

public class ObjetoCaneta {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.cor = "azul";
        c1.ponta = 0.5f;
        c1.tampar();
        c1.rabiscar();
        c1.destampar();
        c1.rabiscar();
        c1.status();
    }
}
