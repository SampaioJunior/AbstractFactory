package bridge;

/**
 * Created by Junior on 03/06/2016.
 */
public abstract class Veiculo {
    Motor motor;
    int pesoKilos;

    public abstract void motorista();

    public void setMotor(Motor motor){
        this.motor = motor;
    }

    public void informacaoVelocidade(int cavalos){
        int razao = pesoKilos / cavalos;
        if (razao < 3){
            System.out.println("\nO veiculo esta em uma velocidade rapida");
        }else if ((razao >= 3) && (razao < 8)){
            System.out.println("\nO veiculo esta em uma velocidade media");
        }else {
            System.out.println("\nO veiculo esta em uma velocidade baixa");
        }

    }
}
