package ufc_game;

import java.util.Scanner;
import java.util.Random;


public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    Scanner sc = new Scanner(System.in);

    public void marcarLuta(Lutador l1, Lutador l2){
        if(l1.getCategoria().equals(l2.getCategoria()) && l1 != l2){
            this.aprovada = true;
            this.desafiado = l1;
            this.desafiante = l2;
        } else {
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }

    }
    public void lutar(){
        if(this.aprovada) {
            System.out.println("###DESAFIADO###");
            this.desafiado.status();
            System.out.println("###DESAFIANTE###");
            this.desafiante.status();
            String[] opcoes = {"pedra", "papel", "tesoura"};
            Random rand = new Random();
            int indice = rand.nextInt(3); // 0, 1 ou 2
            String escolhaComputador = opcoes[indice];
            System.out.println("pedra papel ou tesoura?");
            String escolha = sc.nextLine().toLowerCase();
            System.out.println("adversário escolheu " + escolhaComputador);

            if (escolha.equals(escolhaComputador)) {
                this.desafiante.empatar();
                this.desafiado.empatar();
                System.out.println("empate!");
            } else if (
                    (escolha.equals("pedra") && escolhaComputador.equals("tesoura")) ||
                            (escolha.equals("papel") && escolhaComputador.equals("pedra")) ||
                            (escolha.equals("tesoura") && escolhaComputador.equals("papel"))) {
                this.desafiante.ganhar();
                this.desafiado.perder();
                System.out.println("você venceu!");
            } else if (
                    (escolha.equals("pedra") && escolhaComputador.equals("papel")) ||
                            (escolha.equals("papel") && escolhaComputador.equals("tesoura")) ||
                            (escolha.equals("tesoura") && escolhaComputador.equals("pedra"))) {
                this.desafiante.perder();
                this.desafiado.ganhar();
                System.out.println("você perdeu");
            } else {
                System.out.println("invalido");


            }
        } else{
            System.out.println("luta não aprovada");
        }
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
}