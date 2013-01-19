package zad3.zad3.pizzeria;

import zad3.zad3.Pizza.Pizza;
import zad3.zad3.Pizza.PolishCheesePizza;

public class PolishPizzeria extends Pizzeria{

	@Override
	public Pizza createPizza(String nazwa) {
		Pizza result = null;
		
		if(nazwa.equalsIgnoreCase("serowa"))
			{
				result = new PolishCheesePizza();
				result.preparing();
				result.baking();
				result.cutting();
				result.packeging();
			}
		
		
		return result;
	}

}
