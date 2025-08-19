package ufc_game;
import java.util.Scanner;
import java.util.Random;
public class Lutador {

    Scanner sc = new Scanner(System.in);
    private String name;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    public Lutador(String na, String nac, int id, float al, float pe, int vi, int de, int em){
        this.name = na;
        this.nacionalidade = nac;
        this.idade = id;
        this.altura = al;
        this.peso = pe;
        this.vitorias = vi;
        this.derrotas = de;
        this.empates = em;
        definirCategoria();

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

    public void definirCategoria(){
        if (this.peso < 52.2f) {
            this.categoria = "Inválido (muito leve)";
        } else if (this.peso <= 70.3f) {
            this.categoria = "Peso Leve";
        } else if (this.peso <= 83.9f) {
            this.categoria = "Peso Médio";
        } else if (this.peso <= 120.2f) {
            this.categoria = "Peso Pesado";
        } else {
            this.categoria = "Inválido (muito pesado)";
        }
    }
public void apresentar(){
    System.out.println("Nome: " + this.name);
    System.out.println("Nacionalidade: " + this.nacionalidade);
    System.out.println("Idade: " + this.idade);
    System.out.println("Altura: " + this.altura);
    System.out.println("Peso: " + this.peso);
    System.out.println("Categoria: " + this.categoria);
    System.out.println("Vitórias: " + this.vitorias);
    System.out.println("Derrotas: " + this.derrotas);
    System.out.println("Empates: " + this.empates);
}
    public void status(){
        System.out.println("Nome: " + this.name);
        System.out.println("Idade: " + this.idade);
        System.out.println("Categoria: " + this.categoria);
        System.out.println("Vitórias: " + this.vitorias);
        System.out.println("Derrotas: " + this.derrotas);
        System.out.println("Empates: " + this.empates);
    }

    public void empatar(){
        this.empates++;
    }
    public void perder(){
        this.derrotas++;
    }
    public void ganhar(){
        this.vitorias++;
    }



}



