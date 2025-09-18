public class Principal{

    public static void main(String[] args) {
        
        System.out.println("Instanciando um objeto Aluno...");

        // Instanciando um objeto do tipo Aluno e atribuindo valores a seus atributos

        Aluno joao = new Aluno("Joao da Silva", "123456");

        Aluno maria = new Aluno();
        maria.setNome("Maria Silva");
        maria.setProntuario("34567");

        System.out.println("Aluno: " + joao.getProntuario() + " - " + joao.getNome());
        System.out.println("Aluno: " + maria.getProntuario() + " - " + maria.getNome());
    }
}