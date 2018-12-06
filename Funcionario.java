

public class Funcionario extends Pessoas{
    public String tipo;
    public double salario;
    
    public Funcionario(){
        super("",0,"","","");
        
    }
    
    public String getTipo(){
        return this.tipo;
    }
    
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    
    public double getSalario(){
        return this.salario;
    }
    
    public void setSalario(){
        this.salario = salario;
    }
}
