package ufc_game;

public class UfcRunner {
    public static void main(String[] args) {
        Lutador l[] = new Lutador[6];
        l[0] = new Lutador("Eric", "Brasil", 20, 1.80f, 67.6f, 0, 0, 0);
        l[1] = new Lutador("Rick", "Brasil", 22, 1.95f, 95.3f, 0, 0, 0);
        l[2] = new Lutador("Saulo", "Brasil", 11, 1.46f, 55.3f, 0, 0, 0);
        l[3] = new Lutador("Eraldo", "Brasil", 18, 1.70f, 60.6f, 0, 0, 0);
        l[4] = new Lutador("Mayke", "Brasil", 19, 1.68f, 85.6f, 0, 0, 0);
        l[5] = new Lutador("Pildas", "Brasil", 18, 1.79f, 64.6f, 0, 0, 0);

        l[0].apresentar();
        l[2].apresentar();
        l[1].apresentar();
    }
}