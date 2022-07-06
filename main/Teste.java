

import Facade.Facade;
import Singleton.SingletonEager;
import Singleton.SingletonLazy;
import Strategy.*;

public class Teste {
    public static void main(String[] args) {

        //Testes relacionados ao Design Pattern Singleton
        SingletonLazy lazy = SingletonLazy.getInstance();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstance();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstance();
        System.out.println(eager);
        eager = SingletonEager.getInstance();
        System.out.println(eager);

        //Strategy

        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento ofensivo = new ComportamentoOfensivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);

        robo.mover();

        //Facade
        Facade facade = new Facade();
        facade.migrarCliente("Argus", "14801788");


    }
}
