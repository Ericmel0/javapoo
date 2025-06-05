package exemplo.caneta;

public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    Boolean tampada;

    void status(){
        System.out.println("uma caneta " + this.cor);
        System.out.println(this.tampada);
    }
    void rabiscar(){
        if(this.tampada == true){
            System.out.println("caneta tampada");
        }else {
            System.out.println("rabiscando");
        }}
    void tampar(){
        this.tampada = true;

    }
    void destampar(){
        this.tampada = false;

    }
}
