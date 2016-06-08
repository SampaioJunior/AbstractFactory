package state;

/**
 * Created by Junior on 08/06/2016.
 */
public class TVStart implements State {
    @Override
    public void acao(Context context) {
        System.out.println("TV esta ligada");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "Start State";
    }
}
