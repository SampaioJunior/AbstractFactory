package bridge;

/**
 * Created by Junior on 03/06/2016.
 */
public class Carro extends Veiculo {
    public Carro(Motor motor) {
        this.pesoKilos = 700;
        this.motor = motor;
    }

    @Override
    public void motorista() {
        System.out.println("Dirigindo o carro");
        int cavalos = motor.ir();
        informacaoVelocidade(cavalos);
    }
}
