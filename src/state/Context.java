package state;

/**
 * Created by Junior on 08/06/2016.
 */
//Context é uma classe que carrega um estado
public class Context {
    private State state;

    public Context() {
        state = null;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
