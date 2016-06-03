package bridge;

/**
 * Created by Junior on 03/06/2016.
 */
public class PequenoMotor implements Motor {
    int cavalos;

    public PequenoMotor() {
        cavalos = 100;
    }

    @Override
    public int ir() {
        System.out.println("O motor pequeno esta funcionando");
        return cavalos;
    }
}
