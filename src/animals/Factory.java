package animals;

import animals.birds.Duck;
import animals.data.AnimalData;
import animals.pets.Cat;
import animals.pets.Dog;
import java.util.Scanner;


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

    public static Factory getData() {
        String name="";
        int age=-1;
        double weight=-1;
        String color="";


        Scanner scanner = new Scanner(System.in);
        int i=0;
        System.out.println("Введите имя?");
        while(!scanner.hasNext("[a-zA-Z]*$")) {
            System.out.println("Вводите только буквы!");
            scanner.next();
        }
        name=scanner.next();

        System.out.println("Введите возраст?");
        while (!scanner.hasNextInt()) {
            System.out.println("Вводите только целое число!");
            scanner.next();
        }
        age=scanner.nextInt();

        System.out.println("Введите вес?");
        while (!scanner.hasNextDouble()) {
            System.out.println("Вводите только число(разделитель запятая)!");
            scanner.next();
        }
        weight=scanner.nextDouble();

        System.out.println("Введите цвет?");
        while(!scanner.hasNext("[a-zA-Z]*$")) {
            System.out.println("Вводите только буквы!");
            scanner.next();
        }
        color=scanner.next();
        Factory arr = new Factory(name,age,weight,color);
        return arr;
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
