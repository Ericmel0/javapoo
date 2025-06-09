package exemplo.caneta;

public class CanetaMolde {
    private String modelo;
    private float ponta;
    private boolean tampa;
    private String cor;


    public CanetaMolde (String m, String c, float p, boolean t) {
        this.setModelo(m);
        this.setCor(c);
        this.setPonta(p);
        this.setTampa(t);
    }


    public boolean getTampa(){return this.tampa;}
    public void setTampa(Boolean t){this.tampa = t;}

    public String getModelo() {return this.modelo;}
    public void setModelo(String m) {this.modelo = m;}

    public float getPonta(){return this.ponta;}
    public void setPonta(float p){this.ponta = p;}

    public String getCor() {return this.cor;}
    public void setCor(String c) {this.cor = c;}


    public void tampar(){
        this.tampa = true;
    }
    public void destampar(){
        this.tampa = false;
    }


    public void status() {
        System.out.println("Sobre a caneta");
        System.out.println("Modelo: " + this.modelo);
        System.out.println("ponta: " + this.ponta);
        System.out.println("cor: " + this.cor);
        System.out.println("tampa: " + this.tampa);
    }
}
