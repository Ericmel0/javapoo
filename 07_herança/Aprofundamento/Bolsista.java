package Aprofundamento;

public class Bolsista extends Aluno {
    private float bolsa;

    public void renovarBolsa(){
        System.out.println("bolsa renovada");
    }

    @Override
    public void  pagarMensalidade() {
        System.out.println("mensalidade pagadinha");
    }
}