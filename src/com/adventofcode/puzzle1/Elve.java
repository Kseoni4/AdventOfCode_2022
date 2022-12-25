package com.adventofcode.puzzle1;

public class Elve {

    private int calories;

    public Elve(int calories){
        this.calories = calories;
    }

    public int getCalories(){
        return this.calories;
    }

    @Override
    public String toString() {
        return "Calories: "+calories;
    }
}
