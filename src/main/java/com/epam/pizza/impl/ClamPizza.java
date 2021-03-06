package com.epam.pizza.impl;

import com.epam.City;
import com.epam.pizza.DoughType;
import com.epam.pizza.Pizza;
import com.epam.pizza.SauceType;
import com.epam.pizza.Topping;

public class ClamPizza extends AbstractPizza implements Pizza {

    public ClamPizza() {
        super();
    }

    @Override
    public void prepare(City city) {
        if (city == City.Lviv) {
            toppings.add(Topping.Cheddar);
            toppings.add(Topping.Ham);
            toppings.add(Topping.Clams);
            toppings.add(Topping.Mushrooms);
            toppings.add(Topping.Tomatoes);
            toppings.add(Topping.Pepper);
            doughType = DoughType.Thin;
            sauceType = SauceType.Pesto;
        } else if (city == City.Kyiv) {
            toppings.add(Topping.Parmesan);
            toppings.add(Topping.Sausage);
            toppings.add(Topping.Clams);
            toppings.add(Topping.Tomatoes);
            toppings.add(Topping.Olives);
            doughType = DoughType.Thin;
            sauceType = SauceType.PlumTomato;
        } else if (city == City.Dnipro) {
            toppings.add(Topping.Mozzarella);
            toppings.add(Topping.Ham);
            toppings.add(Topping.Clams);
            toppings.add(Topping.Mushrooms);
            toppings.add(Topping.Onion);
            toppings.add(Topping.Tomatoes);
            doughType = DoughType.Thick;
            sauceType = SauceType.Marinara;
        }
        logger.trace("The pizza has been prepared!");
    }

    @Override
    public String toString() {
        return "ClamPizza{" +
                "toppings=" + toppings +
                ", doughType=" + doughType +
                ", sauceType=" + sauceType +
                "}";
    }
}
