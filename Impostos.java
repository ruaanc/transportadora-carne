
public abstract class Impostos implements ImpostosIF {
    private String descricao;
    
    public Impostos (String descricao){
        this.descricao = descricao;
    }
    
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    
    public String getDescriscao(){
        return this.descricao;
    }
}
