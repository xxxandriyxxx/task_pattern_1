package com.epam.factory;

import com.epam.City;
import com.epam.PizzaType;
import com.epam.pizza.Pizza;

public abstract class Store {

    protected abstract Pizza createPizza(PizzaType pizzaType);

    public Pizza order(City city, PizzaType pizzaType) {
        Pizza pizza = createPizza(pizzaType);
        pizza.prepare(city);
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
