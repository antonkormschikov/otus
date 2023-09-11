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
        System.out.println("Введите имя?");
        while(!scanner.hasNext("[a-zA-Z]*$")&&!scanner.hasNext("[а-яА-Я]*$")) {
            System.out.println("Вводите только буквы!");
            scanner.next();
        }
        name=scanner.next();


        boolean correctAge=false;
        int tempAge=-1;
        while (!correctAge){
            System.out.println("Введите возраст?");
            if (!scanner.hasNextInt()){
                System.out.println("Вводите только целое число!");
                scanner.next();
            } else {tempAge=scanner.nextInt();
                if (tempAge<=0){
                    System.out.println("Возраст должен быть больше 0!");
                    //scanner.next();
                } else {  correctAge = true;}
            }

        }
        age=tempAge;

        boolean correctWeight=false;
        double tempWeight =-1;
        while (!correctWeight){
            System.out.println("Введите вес?");
            if (!scanner.hasNextDouble()){
                System.out.println("Вводите только число(разделитель запятая)!");
                scanner.next();
            } else {tempWeight=scanner.nextDouble();
                if (tempWeight<=0){
                    System.out.println("Вес должен быть больше 0");
                } else {correctWeight=true;}
            }
            }

        weight=tempWeight;

        System.out.println("Введите цвет?");
        while(!scanner.hasNext("[a-zA-Z]*$")&&!scanner.hasNext("[а-яА-Я]*$")) {
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
