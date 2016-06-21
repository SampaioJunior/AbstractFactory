package adapter;

/**
 * Created by Junior on 21/06/2016.
 */
public class AdapterCabo extends CaboHdmi{
    private CaboVga caboVga;

    public AdapterCabo(CaboVga caboVga) {
        this.caboVga = caboVga;
    }

    public void UsandoCaboHdmi(){
        caboVga.UsandoCaboVga();
    }
}
