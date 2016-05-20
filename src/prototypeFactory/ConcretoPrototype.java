package prototypeFactory;

public class ConcretoPrototype implements Prototype{
    private String filme;
    private String album;
    private String show;

    public ConcretoPrototype() {
        System.out.println("Filmes, album e show");
        System.out.println("---------------------");
        System.out.println("Efilme"+"\t"+"Ealbum"+"\t"+"Eshow");
    }

    public ConcretoPrototype(String filme, String album, String show) {
        this();
        this.filme = filme;
        this.album = album;
        this.show = show;
    }

    public void mostrar(){
        System.out.println(filme + "\t" + album + "\t" + show);
    }

    @Override
    public Prototype getClone() {
        return new ConcretoPrototype(filme, album, show);
    }
}
