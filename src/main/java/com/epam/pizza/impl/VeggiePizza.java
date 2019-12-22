package com.epam.pizza.impl;

import com.epam.City;
import com.epam.pizza.DoughType;
import com.epam.pizza.Pizza;
import com.epam.pizza.SauceType;
import com.epam.pizza.Topping;

public class VeggiePizza extends AbstractPizza implements Pizza {

    public VeggiePizza() {
        super();
    }

    @Override
    public void prepare(City city) {
        if (city == City.Lviv) {
            toppings.add(Topping.Mozzarella);
            toppings.add(Topping.Mushrooms);
            toppings.add(Topping.Tomatoes);
            toppings.add(Topping.Pepper);
            doughType = DoughType.Thin;
            sauceType = SauceType.PlumTomato;
        } else if (city == City.Kyiv) {
            toppings.add(Topping.Cheddar);
            toppings.add(Topping.Tomatoes);
            toppings.add(Topping.Onion);
            doughType = DoughType.Thin;
            sauceType = SauceType.Marinara;
        } else if (city == City.Dnipro) {
            toppings.add(Topping.Parmesan);
            toppings.add(Topping.Mushrooms);
            toppings.add(Topping.Cucumbers);
            toppings.add(Topping.Onion);
            doughType = DoughType.Thick;
            sauceType = SauceType.Pesto;
        }
        logger.trace("The pizza has been prepared!");
    }

    @Override
    public String toString() {
        return "VeggiePizza{" +
                "toppings=" + toppings +
                ", doughType=" + doughType +
                ", sauceType=" + sauceType +
                "}";
    }
}
