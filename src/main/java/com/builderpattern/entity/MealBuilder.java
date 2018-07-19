package com.builderpattern.entity;

/**
 * com.entity [workset_idea_01]
 * Created by Richard on 2018/4/2
 *
 * @author Richard on 2018/4/2
 */
public class MealBuilder {

    public Meal prepareVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
