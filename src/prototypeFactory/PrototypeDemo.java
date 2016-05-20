package prototypeFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrototypeDemo {
    public static void main(String arg[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("nome do filme");
        String efilme = br.readLine();
        System.out.println("\n");

        System.out.println("nome do album");
        String ealbum = br.readLine();
        System.out.println("\n");

        System.out.println("nome do show");
        String eshow = br.readLine();
        System.out.println("\n");

        ConcretoPrototype cp = new ConcretoPrototype(efilme,ealbum,eshow);
        cp.mostrar();
        System.out.println("\n");

        ConcretoPrototype cp2 = (ConcretoPrototype) cp.getClone();
        cp2.mostrar();
    }
}
