package animals;

import animals.*;
import animals.birds.Duck;
import animals.data.AnimalData;
import animals.pets.Cat;
import animals.pets.Dog;


public class Factory {
   private String name;
    private int age;
    private double weight;
    private String color;

    public Factory(String name, int age, double weight, String color) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = color;
    }


    public Animal create(AnimalData animalData){
        switch (animalData){
            case CAT: return new Cat(name,age,weight,color);
            case DOG: return new Dog(name,age,weight,color);
            case DUCK: return new Duck(name,age,weight,color);
        }
        return null;
    }
}
