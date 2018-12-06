
public class Pessoas {
    private String nome;
    private int idade;
    private String estadoCivil;
    private String CPF;
    private String RG;
    
    
    public Pessoas(String nome, int idade, String estadoCivil, String CPF, String RG){
        this.nome = nome;
        this.idade = idade;
        this.estadoCivil = estadoCivil;
        this.CPF = CPF;
        this.RG = RG;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public int getIdade(){
        return this.idade;
    }
    
    public void setIdade(int idade){
        this.idade = idade;
    }
    
    public String getEstadoCivil(){
        return this.estadoCivil;
    }
    
    public void setEstadoCivil(String estC){
        this.estadoCivil = estC;
    }
    
    public String GetCPF(){
        return this.CPF;
    }
    
    public void setCPF(String cpf){
        this.CPF = cpf;
    }
    
    public String getRG(){
        return this.RG;
    }
    
    public void setRG(String rg){
        this.RG = rg;
    }
        
}
