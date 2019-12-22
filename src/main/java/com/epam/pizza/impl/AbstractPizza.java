package com.epam.pizza.impl;

import com.epam.City;
import com.epam.pizza.DoughType;
import com.epam.pizza.SauceType;
import com.epam.pizza.Topping;

import java.util.List;

public abstract class AbstractPizza {

    protected List<Topping> toppings;
    protected DoughType doughType;
    protected SauceType sauceType;

    protected abstract void prepare(City city);

    public void bake() {
        System.out.println("The pizza has been baked!!");
    }

    public void cut() {
        System.out.println("The pizza has been cut!");
    }

    public void box() {
        System.out.println("The pizza has been packed!");
    }
}
