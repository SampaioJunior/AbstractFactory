package bridge;


/**
 * Created by Junior on 03/06/2016.
 */
public class Bean {
    public static void main(String[] args){
        Veiculo v = new Onibus(new PequenoMotor());
        v.motorista();
        v.setMotor(new GrandeMotor());
        v.motorista();

        v = new Carro(new PequenoMotor());
        v.motorista();
        v.setMotor(new GrandeMotor());
        v.motorista();
    }



}
