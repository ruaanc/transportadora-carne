

public class ISS extends Impostos{
    public final double ALIQUOTA_CONFINS_GERAL = 0.05;
    
    public ISS() {
        super("Imposto");
    }
    
    public double calcular(double valor) {
        return valor* ALIQUOTA_CONFINS_GERAL;
    }
    
}
