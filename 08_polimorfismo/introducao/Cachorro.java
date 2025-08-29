package introducao;

public class Cachorro extends Lobo{
    @Override
    public void emitirSom() {
        System.out.println("au au au");
    }
    public void reagir(String frase){
        if(frase.equals("toma comida") || frase.equals("olá")){
            System.out.println("abanar");
        } else {
            System.out.println("rosnar");
        }

    };
    public void reagir(int hora, int min){
        if (hora < 12){
            System.out.println("abanar");}
            else if(hora >= 18){
                System.out.println("ignorar");
            }
            else {
                System.out.println("latir");
        }
    };
    public void reagir(boolean dono) {
        if (dono == true) {
            System.out.println("abanar");
            } else {
            System.out.println("latir");
            };
    }
    public void reagir(int idade, float peso) {
        if (idade < 5) {
            if (peso < 10) {
                System.out.println("abanar");
            } else {
                System.out.println("latir");
            }
        } else {
            if (peso < 10) {
                System.out.println("rosnar");
            } else {
                System.out.println("ignorar");
            }
        }
    }
}