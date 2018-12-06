import java.util.ArrayList;
public class Serviços{
    private static double contador = 0.0;
    
    private int id;
    private String data;
    private ArrayList<LinhaServiço> linhas = new ArrayList<>();
    
    public static void setContador(double contador) {
        Serviços.contador = contador;
    }
    
    public static double getContador() {
        return contador;
    }
        
    public void addLinha(LinhaServiço linha) {
        linhas.add(linha);
    }
    
    public ArrayList<LinhaServiço> getLinhas() {
        return linhas;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public int getId() {
        return id;
    }
    
    public void setData(String data) {
        this.data = data;
    }
    
    public String getData() {
        return data;
    }
    
    public static double getFaturamentoGeral() {
        return contador;
    }
}
