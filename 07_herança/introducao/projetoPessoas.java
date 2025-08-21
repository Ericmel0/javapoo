package introducao;

public class projetoPessoas {
    public static void main(String[] args) {

        pessoa p1 = new pessoa();
        aluno p2 = new aluno();
        professor p3 = new professor();
        funcionario p4 = new funcionario();
        p1.setNome("pedro");
        p2.setNome("joão");
        p3.setNome("maria");
        p4.setNome("josé");

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());


    }
}
