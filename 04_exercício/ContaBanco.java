import java.util.Scanner;
import java.util.Random;

public class ContaBanco {
    public String numConta;
    public String tipo;
    private String dono;
    private int saldo;
    private Boolean status;

    Scanner sc = new Scanner(System.in);

    public void setNumConta(String numConta) {this.numConta = numConta;}
    public String getNumConta() {return numConta;}

    public void setDono(String dono) {this.dono = dono;}
    public String getDono() {return dono;}

    public void setTipo(String tipo) {this.tipo = tipo;}
    public String getTipo() {return tipo;}

    public void setSaldo(int saldo) {this.saldo = saldo;}
    public int getSaldo() {return saldo;}

    public void setStatus(Boolean status) {this.status = status;}
    public Boolean getStatus() {return status;}

    public void abrirConta(){
        System.out.println("seja bem vindo, por favor, insira seu nome:");
        String dono = sc.next();
        System.out.println("Olá " + dono + " digite o tipo de conta: CC ou CP");
        String t = sc.next();
        Random random = new Random();
        this.numConta = String.format("%06d", random.nextInt(999999));
    if(t.equalsIgnoreCase("CC")){
        this.tipo = "CC";
        this.saldo = 50;
        this.status= true;
        this.dono = dono;
    }else if (t.equalsIgnoreCase("CP")){
        this.tipo = "CP";
        this.saldo = 150;
        this.status= true;
        this.dono = dono;
        }
    else {
            System.out.println("insira um tipo válido");
        }
    }


    public void fecharConta(){
        this.saldo = 0;
        this.tipo = null;
        this.status = false;
        this.dono = null;
    }


    public void depositar(){
        System.out.println("Quanto você deseja depositar?");
        int valor = sc.nextInt();
        if(valor > 0){
        this.saldo += valor;
            System.out.println("você depositou: "+ valor + " reais em sua conta, seu saldo atual é: " +this.saldo);
    } else {
            System.out.println("digite um valor válido acima de 0");
        }}

       public void sacar(){
            System.out.println("Quanto você deseja sacar?");
            int valor = sc.nextInt();
            if(valor > 0 && valor <= this.saldo){
                this.saldo -= valor;
                System.out.println("você sacou: "+ valor + " reais em sua conta, seu saldo atual é: " +this.saldo);
            } else {
                System.out.println("digite um valor válido acima de 0");
        }}

    public void conta(){
        System.out.println("Status da conta: ");
        System.out.println("número da conta: " + numConta);
        System.out.println("tipo da conta: " + tipo);
        System.out.println("dono da conta: " + dono);
        System.out.println("saldo da conta: " + saldo);
        System.out.println("conta aberta ou fechada: " + status);
    }

public void fecharScanner(){
    sc.close();
}}
