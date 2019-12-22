package com.epam.pizza;

import com.epam.City;

public interface Pizza {

    void prepare(City city);

    void bake();

    void cut();

    void box();
}
