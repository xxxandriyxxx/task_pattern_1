package com.epam.pizza.impl;

import com.epam.City;
import com.epam.pizza.DoughType;
import com.epam.pizza.SauceType;
import com.epam.pizza.Topping;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractPizza {

    protected List<Topping> toppings;
    protected DoughType doughType;
    protected SauceType sauceType;
    protected Logger logger;

    public AbstractPizza() {
        logger = LogManager.getLogger(AbstractPizza.class);
        toppings = new ArrayList<>();
    }

    protected abstract void prepare(City city);

    public void bake() {
        logger.trace("The pizza has been baked!");
    }

    public void cut() {
        logger.trace("The pizza has been cut!");
    }

    public void box() {
        logger.trace("The pizza has been packed!");
    }
}
