package zad3.zad3.pizzeria;

import zad3.zad3.Pizza.Pizza;

public abstract class Pizzeria {
	
	public abstract Pizza createPizza(String nazwa);
	public Pizza makeOrder(String nazwa)
	{
		Pizza result = createPizza(nazwa);
		System.out.println("Pizza już jedzie");
		
		return result;
	}
}
