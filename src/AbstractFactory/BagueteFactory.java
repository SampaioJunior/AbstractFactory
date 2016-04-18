package AbstractFactory;

public class BagueteFactory extends Pao{

    public BagueteFactory() {
        this.pao = "Baguete";
        montaBaquete();
    }

    public PaoBaguete montaBaquete(){
        return new PaoBaguete();
    }
}
