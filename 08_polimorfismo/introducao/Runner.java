package introducao;

public class Runner {
    public static void main(String[] args) {
        Mamifero m = new Mamifero();
        Lobo l = new Lobo();
        Cachorro c = new Cachorro();
        c.emitirSom();
        l.emitirSom();
        m.emitirSom();
    }
}
