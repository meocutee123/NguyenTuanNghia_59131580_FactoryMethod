package pizza_store;

import pizza.Pizza;
import pizza.PizzaType;
import chicago_pizza.ChicagoCheeseStyle;
import chicago_pizza.ChicagoClamStyle;
import chicago_pizza.ChicagoPepperoniStyle;

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
        Pizza pizza = null;
        if(type.equals("Cheese")){
            pizza = new ChicagoCheeseStyle();
        } else if(type.equals("Clam")){
            pizza = new ChicagoClamStyle();
        }
        return pizza;
    }
}