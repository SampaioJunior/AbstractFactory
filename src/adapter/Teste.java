package adapter;

/**
 * Created by Junior on 21/06/2016.
 */
public class Teste {
    public static void main(String[] args){
        CaboVga vga = new CaboVga();

        AdapterCabo adapterCabo = new AdapterCabo(vga);
        adapterCabo.UsandoCaboHdmi();
    }
}
