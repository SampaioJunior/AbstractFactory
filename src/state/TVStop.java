package state;

/**
 * Created by Junior on 08/06/2016.
 */
public class TVStop implements State {
   //criando a classe concreta para implementar a interface
    @Override
    public void acao(Context context) {
        System.out.println("TV esta desligada");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "Stop State";
    }
}
