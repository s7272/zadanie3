package zad3.zad3;

import zad3.zad3.pizzeria.ItalianPizzeria;
import zad3.zad3.pizzeria.Pizzeria;
import zad3.zad3.pizzeria.PolishPizzeria;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Pizzeria pizzeria = new ItalianPizzeria();
        
        pizzeria.makeOrder("serowa");
    }
}
