package animals;

import animals.birds.Duck;
import animals.data.AnimalData;
import animals.pets.Cat;
import animals.pets.Dog;
import static animals.tools.GetAnimalData.getData;


public class Factory {
   private final String name;
    private final int age;
    private final double weight;
    private final String color;

    public Factory(String name, int age, double weight, String color) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = color;
    }



    public Animal create(AnimalData animalData){
        switch (animalData){

            case CAT:{
                Factory a = getData();
                return new Cat(a.name,a.age,a.weight,a.color);
            }
            case DOG: {
                Factory a = getData();
                return new Dog(a.name,a.age,a.weight,a.color);
            }
            case DUCK: {
                Factory a = getData();
                return new Duck(a.name,a.age,a.weight,a.color);}
            default:
                System.out.println("Неверный тип животного");
        }
        return null;
    }
}
