package com.example.oop_madlib;

public class MadLib {

    private String animal;
    private String name;
    private String food;
    private String place;
    private String secondPlace;
    private String adjective;
    private String secondName;
    private int number;


    // Add the option to create madlib in one argument.
    public void createMadlib(String animal, String name, String food, String place, String secondPlace, String adjective, String secondName, int number) {
        this.animal = animal;
        this.name = name;
        this.food = food;
        this.place = place;
        this.secondPlace = secondPlace;
        this.adjective = adjective;
        this.secondName = secondName;
        this.number = number;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public void setSecondPlace(String secondPlace) {
        this.secondPlace = secondPlace;
    }

    public void setAdjective(String adjective) {
        this.adjective = adjective;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setNumber(int number) {
        this.number = number * 2;
    }

    public String toString() {
        return  "Once there was a " + animal + " named " + name
                + ". Their favorite thing to eat is " + food
                + " but they cannot find any! They searched " + place
                + " and " + secondPlace + " but had no luck! By the end"
                + " of the day, " + name + " was so " + adjective
                + ". Little did they know, their best friend, " + secondName
                + " had taken " + number + " of " + name + "'s favorite " + food + ".";
    }
}
