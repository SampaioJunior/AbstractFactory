package AbstractFactory;


public class PaoFrancesFactory extends Pao {

    public PaoFrancesFactory() {
        this.pao = "Pao Frances";
        montaPaoF();
    }
    public PaoFrances montaPaoF(){
        return new PaoFrances();
    }
}
