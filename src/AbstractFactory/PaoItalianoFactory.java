package AbstractFactory;

public class PaoItalianoFactory extends Pao{

    public PaoItalianoFactory() {
        this.pao = "Pao Italiano";
        montaPaoI();
    }

    public PaoItaliano montaPaoI(){
        return new PaoItaliano();
    }
}
