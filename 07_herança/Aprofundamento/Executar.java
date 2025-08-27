package Aprofundamento;

public class Executar {
    public static void main(String[] args) {
        /*Visitante v1 = new Visitante();
        v1.setNome("eric");
        System.out.println(v1.toString());*/
        Aluno a1 = new Aluno();
        Bolsista b1 = new Bolsista();
        a1.setNome("Samylla");
        a1.setMatricula(11);
        a1.setCurso("pedagogia");
        a1.setIdade(18);
        a1.setSexo("F");
        a1.pagarMensalidade();
        b1.pagarMensalidade();
}}
