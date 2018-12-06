
public class Produto{
    private int codPeca;
    private double pesoKG;
    private String descricao;
    private String tipo;
    private String nome;
    private String qualidade; 
    
    public int getCodPeca(){
        return this.codPeca;
    }
    
    public void setCodPeca(int codPeca){
        this.codPeca = codPeca;
    }
    
    public double getPesoKG(){
        return this.pesoKG;
    }
    
    public void setPesoKG(double PesoKG){
        this.pesoKG = PesoKG;
    }
    
    public String getDescricao(){
        return this.descricao;
    }
    
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    
    public String getTipo(){
        return this.tipo;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getQualidade(){
        return this.qualidade;
    }
    
    public void setQualidade(String qualidade){
        this.qualidade = qualidade; 
    }
    
}
