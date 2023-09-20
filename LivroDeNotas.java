public class LivroDeNotas{
    private String nomeDoCurso;

    //Construtor com parâmetro 
    
    public LivroDeNotas (String nomeDoCurso){
        this.nomeDoCurso = nomeDoCurso;
    }

    //Construtor Padrão
    public LivroDeNotas (){
        
    }

    //Métodos de Acesso
    public String getNomeDoCurso (){
        return nomeDoCurso;
    }
    //Métodos Modificadores
    public void setNomeDoCurso (String nomeDoCurso){
        this.nomeDoCurso = nomeDoCurso;
    }
    public void exibeMensagem (){
        System.out.println("Bem-vindo ao livro de notas do curso " + nomeDoCurso);
    }
}