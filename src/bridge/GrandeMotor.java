package bridge;

/**
 * Created by Junior on 03/06/2016.
 */
// implemento a interface com esta classe
public class GrandeMotor implements Motor {
    int cavalos;

    public GrandeMotor() {
        cavalos = 350;
    }

    //metodo que relata que esta sendo executado e retorna os cavalos(potencia)
    @Override
    public int ir() {
        System.out.println("o motor grande esta funcionando");
        return cavalos;
    }
}
