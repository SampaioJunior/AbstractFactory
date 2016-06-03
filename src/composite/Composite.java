package composite;

/**
 * Created by Junior on 03/06/2016.
 */
public class Composite {
    public static void main(String[] args){
        Empregado ceo = new Empregado("Junior","CEO",15000);

        Empregado chefeVendas = new Empregado("Julia","Chefe de vendas",10000);

        Empregado marketing = new Empregado("Denis", "Marketing", 10000);

        Empregado balconista = new Empregado("Larissa","Marketing",2000);
        Empregado balconista2 = new Empregado("Maria","Marketing",2000);

        Empregado executivoVendas = new Empregado("laura", "Vendas" , 5000 );
        Empregado executivoVendas2 = new Empregado("Diana", "Vendas" , 5000 );

        ceo.adiciona(chefeVendas);
        ceo.adiciona(marketing);

        chefeVendas.adiciona(executivoVendas);
        chefeVendas.adiciona(executivoVendas2);

        marketing.adiciona(balconista);
        marketing.adiciona(balconista2);

        System.out.println(ceo);

        for (Empregado supervisor : ceo.getSubordinados()){
            System.out.println(supervisor);
            for (Empregado empregado : supervisor.getSubordinados()){
                System.out.println(empregado);
            }
        }

    }
}
