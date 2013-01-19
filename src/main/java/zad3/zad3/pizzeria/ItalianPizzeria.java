package zad3.zad3.pizzeria;

import zad3.zad3.Pizza.ItalianCheesePizza;
import zad3.zad3.Pizza.Pizza;

public class ItalianPizzeria extends Pizzeria{

	@Override
	public Pizza createPizza(String nazwa) {
Pizza result = null;
		
		if(nazwa.equalsIgnoreCase("serowa"))
			{
				result = new ItalianCheesePizza();
				result.preparing();
				result.baking();
				result.cutting();
				result.packeging();
			}
		
		
		return result;
	}

}
