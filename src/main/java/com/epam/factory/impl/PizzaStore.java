package com.epam.factory.impl;

import com.epam.PizzaType;
import com.epam.factory.Store;
import com.epam.pizza.Pizza;
import com.epam.pizza.impl.CheesePizza;
import com.epam.pizza.impl.ClamPizza;
import com.epam.pizza.impl.PepperoniPizza;
import com.epam.pizza.impl.VeggiePizza;

public class PizzaStore extends Store {

    @Override
    protected Pizza createPizza(PizzaType pizzaType) {
        Pizza pizza = null;
        if (pizzaType == PizzaType.Cheese) {
            pizza = new CheesePizza();
        } else if (pizzaType == PizzaType.Veggie) {
            pizza = new VeggiePizza();
        } else if (pizzaType == PizzaType.Clam) {
            pizza = new ClamPizza();
        } else if (pizzaType == PizzaType.Pepperoni) {
            pizza = new PepperoniPizza();
        }
        return pizza;
    }
}
