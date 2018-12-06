

public class CONFINS extends Impostos{
    public final double ALIQUOTA_CONFINS_GERAL = 0.076;
    
    public CONFINS() {
        super("Imposto");
    }
    
    public double calcular(double valor) {
        return valor* ALIQUOTA_CONFINS_GERAL;
    }
}
