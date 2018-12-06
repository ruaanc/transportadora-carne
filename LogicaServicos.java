import java.util.*;

public class LogicaServicos{
    private ArrayList<ImpostoIF> impostos = new ArrayList<>();
    
    public void addImposto(ImpostoIF imposto){
        this.impostos.add(imposto);
    }
    
    public double getValorTotal(Serviços servicos) {
        double resultado = 0.0;
        
        for (LinhaVenda linha : venda.getLinhas()) {
            resultado += getSubTotal(linha);
        }
        
        return resultado;
    }
    
    public void finalizar(Serviços servicos) {
        double contador = Venda.getContador();
        contador += getValorTotal(venda);
        Venda.setContador(contador);
        
    }
    
    public double getSubTotal(LinhaServiço linhaServico) {
        double valorOriginal = getValorOriginal(linhaVenda); 
        
        
        return valorOriginal + calcularImpostos(linhaVenda);
    }
    
    
        public double calcularImpostos(LinhaServiço linhaServico){
            
            double totalImpostos = 0.0;
        
            for (ImpostoIF imposto : this.impostos) {
            totalImpostos += imposto.calcular(getValorOriginal(linhaVenda), 
                                linhaVenda.getProduto());
                                
        }
        return totalImpostos;
    }
    public double getValorOriginal(LinhaServiço linhaServico) {
        return linhaVenda.getQuantidade() * linhaVenda.getProduto().getPrecoReferencia();
    }



}
