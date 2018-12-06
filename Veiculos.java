

public class Veiculos{
    private String placa;
    private int capacidadeKG;
    private String chassi;
    private String modelo;
    private String ano;
    
    public Veiculos(String placa, int capacidadeKG, String chassi, String modelo,
    String ano){
        this.placa = placa;
        this.capacidadeKG = capacidadeKG;
        this.chassi = chassi;
        this.modelo = modelo;
        this.ano = ano;
    }
    
    public String getPlaca(){
        return this.placa;
    }
    
    public void setPlaca(String placa){
        this.placa = placa;
    }
    
    public int getCapacidadeKG(){
        return this.capacidadeKG;
    }
    
    public void setCapacidadeKG(int capacidade){
        this.capacidadeKG = capacidade;
    }
    
    public String getChassi(){
        return this.chassi;
    }
    
    public void setChassi(String chassi){
        this.chassi = chassi;
    }
    
    public String getModelo(){
        return this.modelo;
    }
    
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    
    public String getAno(){
        return this.ano;
    }
    
    public void setAno(String ano){
        this.ano = ano;
    }
}
