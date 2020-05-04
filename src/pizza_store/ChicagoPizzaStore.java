package pizza_store;

import pizza.Pizza;
import pizza.PizzaType;
import chicago_pizza.ChicagoCheeseStyle;

public class ChicagoPizzaStore extends PizzaStore {

    private static ChicagoPizzaStore store;
    protected ChicagoPizzaStore(){}
    public static ChicagoPizzaStore Store() {
        if (store == null) {
            store = new ChicagoPizzaStore();
        }
        return store;
    }

    @Override
    protected Pizza createPizza(PizzaType type)
    {
        switch(type)
        {
            case cheese: return new ChicagoCheeseStyle();
            case clam: return new ChicagoCheeseStyle();
            case pepperoni: return new ChicagoCheeseStyle();
        }  
        return null;
    }
}