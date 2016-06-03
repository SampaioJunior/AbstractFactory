package bridge;

/**
 * Created by Junior on 03/06/2016.
 */
public class Onibus extends Veiculo {
    //mensagem contendo o pesso do veiculo
    public Onibus(Motor motor) {
        this.pesoKilos = 3000;
        this.motor = motor;
    }
    //metodo pra mostra a velocidade do veiculo
    @Override
    public void motorista() {
        System.out.println("Dirigindo o onibus");
        int cavalos = motor.ir();
        informacaoVelocidade(cavalos);
    }
}
