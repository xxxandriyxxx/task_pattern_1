package com.epam;

import com.epam.factory.Store;
import com.epam.factory.impl.PizzaStore;
import com.epam.pizza.Pizza;

public class Client {

    public static void main(String[] args) {
        orderPizza(City.Lviv, PizzaType.Cheese);
        orderPizza(City.Kyiv, PizzaType.Cheese);
        orderPizza(City.Dnipro, PizzaType.Cheese);
        orderPizza(City.Lviv, PizzaType.Veggie);
        orderPizza(City.Kyiv, PizzaType.Veggie);
        orderPizza(City.Dnipro, PizzaType.Veggie);
        orderPizza(City.Lviv, PizzaType.Clam);
        orderPizza(City.Kyiv, PizzaType.Clam);
        orderPizza(City.Dnipro, PizzaType.Clam);
        orderPizza(City.Lviv, PizzaType.Pepperoni);
        orderPizza(City.Kyiv, PizzaType.Pepperoni);
        orderPizza(City.Dnipro, PizzaType.Pepperoni);
    }

    private static void orderPizza(City city, PizzaType pizzaType) {
        Store store = new PizzaStore();
        System.out.println("*** Ordering " + pizzaType + " pizza in " + city + ":");
        Pizza pizza = store.order(city, pizzaType);
        System.out.println(pizza);
        System.out.println("----------");
    }
}
