public class Aluno {

    private  String prontuario;
    private String nome;

    public Aluno(String nome, String prontuario) {
        this.prontuario = prontuario;
        this.nome = nome;
    }

    public Aluno(){
        
    }

    public void estudar (){
        System.out.println("estudando...");
    }

    public String getProntuario (){
        return prontuario;
    }

    public void setProntuário (String prontuario) {
        this.prontuario = prontuario;
    }

    public String getNome() {
        return nome;
    }
    
    public void setProntuario(String prontuario) {
        this.prontuario = prontuario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}