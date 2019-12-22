package com.epam.pizza.impl;

import com.epam.City;
import com.epam.pizza.DoughType;
import com.epam.pizza.Pizza;
import com.epam.pizza.SauceType;
import com.epam.pizza.Topping;

public class PepperoniPizza extends AbstractPizza implements Pizza {

    public PepperoniPizza() {
        super();
    }

    @Override
    public void prepare(City city) {
        if (city == City.Lviv) {
            toppings.add(Topping.Cheddar);
            toppings.add(Topping.Pepperoni);
            toppings.add(Topping.Mushrooms);
            toppings.add(Topping.Olives);
            toppings.add(Topping.Pepper);
            doughType = DoughType.Thick;
            sauceType = SauceType.Marinara;
        } else if (city == City.Kyiv) {
            toppings.add(Topping.Parmesan);
            toppings.add(Topping.Pepperoni);
            toppings.add(Topping.Tomatoes);
            toppings.add(Topping.Olives);
            doughType = DoughType.Thin;
            sauceType = SauceType.PlumTomato;
        } else if (city == City.Dnipro) {
            toppings.add(Topping.Mozzarella);
            toppings.add(Topping.Pepperoni);
            toppings.add(Topping.Mushrooms);
            toppings.add(Topping.Onion);
            toppings.add(Topping.Tomatoes);
            doughType = DoughType.Thick;
            sauceType = SauceType.Pesto;
        }
        logger.trace("The pizza has been prepared!");
    }

    @Override
    public String toString() {
        return "PepperoniPizza{" +
                "toppings=" + toppings +
                ", doughType=" + doughType +
                ", sauceType=" + sauceType +
                "}";
    }
}
