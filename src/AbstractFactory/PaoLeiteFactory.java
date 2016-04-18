package AbstractFactory;

public class PaoLeiteFactory extends Pao{

    public PaoLeiteFactory() {
        this.pao = "Pao de Leite";
        montaPaoLeite();
    }

    public PaoLeite montaPaoLeite(){
        return new PaoLeite();
    }
}
