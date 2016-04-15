package AbstractFactory;

public class Main {

    public static void main(String[] args) {

        Pao f = fazerpao("frances");
        Pao l = fazerpao("leite");
        Pao pf = fazerpao("Baguete");
        Pao pi = fazerpao("italiano");

        f.ImprimirPao();
        l.ImprimirPao();
        pf.ImprimirPao();
        pi.ImprimirPao();

    }
    private static Pao fazerpao(String pao){
        Pao p = null;

        switch(pao){
            case "frances":
                p = new PaoFrancesFactory();
                break;
            case "leite":
                p = new PaoLeiteFactory();
                break;
            case "Baguete":
                p =  new BagueteFactory();
                break;
            case "italiano":
                p = new PaoItalianoFactory();
                break;
        }

        return p;
    }
}
