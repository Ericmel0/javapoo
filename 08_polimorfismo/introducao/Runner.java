package introducao;

public class Runner {
    public static void main(String[] args) {
        Mamifero m = new Mamifero();
        Lobo l = new Lobo();
        Cachorro c = new Cachorro();
        c.emitirSom();
        l.emitirSom();
        m.emitirSom();
        c.reagir("olá");
        c.reagir(8, 4.5f);
        c.reagir(true);
        c.reagir(false);
    }
}
