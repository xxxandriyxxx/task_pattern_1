package com.epam.pizza.impl;

import com.epam.City;
import com.epam.pizza.DoughType;
import com.epam.pizza.Pizza;
import com.epam.pizza.SauceType;
import com.epam.pizza.Topping;

public class CheesePizza extends AbstractPizza implements Pizza {

    public CheesePizza() {
        super();
    }

    @Override
    public void prepare(City city) {
        if (city == City.Lviv) {
            toppings.add(Topping.Cheddar);
            toppings.add(Topping.Mozzarella);
            toppings.add(Topping.Sausage);
            toppings.add(Topping.Mushrooms);
            toppings.add(Topping.Olives);
            toppings.add(Topping.Pepper);
            doughType = DoughType.Thick;
            sauceType = SauceType.Pesto;
        } else if (city == City.Kyiv) {
            toppings.add(Topping.Parmesan);
            toppings.add(Topping.Ham);
            toppings.add(Topping.Tomatoes);
            toppings.add(Topping.Onion);
            doughType = DoughType.Thin;
            sauceType = SauceType.PlumTomato;
        } else if (city == City.Dnipro) {
            toppings.add(Topping.Mozzarella);
            toppings.add(Topping.Parmesan);
            toppings.add(Topping.Mushrooms);
            toppings.add(Topping.Olives);
            toppings.add(Topping.Tomatoes);
            doughType = DoughType.Thick;
            sauceType = SauceType.Marinara;
        }
        logger.trace("The pizza has been prepared!");
    }

    @Override
    public String toString() {
        return "CheesePizza{" +
                "toppings=" + toppings +
                ", doughType=" + doughType +
                ", sauceType=" + sauceType +
                "}";
    }
}
