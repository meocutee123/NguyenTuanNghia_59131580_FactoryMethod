package pizza;

public abstract class Pizza {
    protected String pizzaStr = "";
    public abstract void prepare();
    public abstract void bake();
    public String cut(){
        pizzaStr +="Cuted ";
        return pizzaStr;
    }

    public String box(){
        pizzaStr +="Boxed ";
        return pizzaStr;
    }
    @Override
    public String toString(){
        return pizzaStr;
    }
}