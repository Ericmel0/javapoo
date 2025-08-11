package ufc_game;
import java.util.Scanner;
import java.util.Random;
public class Lutador {

    private String name;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    public Lutador(String na, String nac, int id, float al, float pe, String ca, int vi, int de, int em){
        this.name = na;
        this.nacionalidade = nac;
        this.idade = id;
        this.altura = al;
        this.peso = pe;
        this.categoria = ca;
        this.vitorias = vi;
        this.derrotas = de;
        this.empates = em;

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getAltura() {
        return altura;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getPeso() {
        return peso;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public int getEmpates() {
        return empates;
    }

    public void lutar() {
        Scanner sc = new Scanner(System.in);
        String[] opcoes = {"pedra", "papel", "tesoura"};
        Random rand = new Random();
        int indice = rand.nextInt(3); // 0, 1 ou 2
        String escolhaComputador = opcoes[indice];
        System.out.println("Computador escolheu: " + escolhaComputador);
        System.out.println("pedra papel ou tesoura?");
        String escolha = sc.next().toLowerCase();

        System.out.println("adversário escolheu" + escolhaComputador);

        if (escolha.equals(escolhaComputador)) {
            this.empates++;
            System.out.println("empate!");
        } else if (
                (escolha.equals("pedra") && escolhaComputador.equals("tesoura")) ||
                        (escolha.equals("papel") && escolhaComputador.equals("pedra")) ||
                        (escolha.equals("tesoura") && escolhaComputador.equals("papel"))) {
            this.vitorias++;
            System.out.println("você venceu");
        } else if (
                (escolha.equals("pedra") && escolhaComputador.equals("papel")) ||
                        (escolha.equals("papel") && escolhaComputador.equals("tesoura")) ||
                        (escolha.equals("tesoura") && escolhaComputador.equals("pedra"))) {
            this.derrotas++;
            System.out.println("você perdeu");
        }
    }
}


