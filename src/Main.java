import animals.*;

import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;


import animals.birds.Duck;
import animals.pets.Cat;
import animals.pets.Dog;

public class Main {

    public static void main(String[] args) {

      String line=null;
        ArrayList<Animal> animals = new ArrayList<Animal>();
        Scanner scanner = new Scanner(System.in);
String name=null;
int age=0;
double weigth=0;
String color=null;

      //Animal animal = new Factory(name, age, weigth, color);


        while (true){
            System.out.println("Введите команду add/list/exit");


            switch (scanner.nextLine().toString().toUpperCase().trim()){

                case "ADD":
                    System.out.println("Какое живоное добавить? (CAT, DOG,DUCK)");
                   switch (scanner.nextLine().toUpperCase().trim()) {
                       case "DOG":
                           System.out.println("Введите имя?");
                           name=scanner.nextLine().toString();
                           System.out.println("Введите возраст?");
                           age=(int)scanner.nextInt();
                           System.out.println("Введите вес?");
                           weigth=(double) scanner.nextDouble();
                           System.out.println("Введите цвет?");
                           color=scanner.nextLine().toString();
                           animals.add(new Dog(name,age,weigth,color));

                           break;

                       case "CAT":
                           System.out.println("Введите имя?");
                           name=scanner.nextLine().toString();
                           System.out.println("Введите возраст?");
                           age=(int)scanner.nextInt();
                           System.out.println("Введите вес?");
                           weigth=(double) scanner.nextDouble();
                           System.out.println("Введите цвет?");
                           color=scanner.nextLine().toString();
                           animals.add(new Cat(name,age,weigth,color));
                           break;

                       case "DUCK":
                           System.out.println("Введите имя?");
                           name=scanner.nextLine().toString();
                           System.out.println("Введите возраст?");
                           age=(int)scanner.nextInt();
                           System.out.println("Введите вес?");
                           weigth=(double) scanner.nextDouble();
                           System.out.println("Введите цвет?");
                           color=scanner.nextLine().toString();
                           animals.add(new Duck(name,age,weigth,color));
                           break;
                   }
                break;
                case "LIST":
                    if (animals.isEmpty()) {
                        System.out.println("Список живоных пуст");
                        break;
                    } else
                    {
                        for (Animal a:animals) {
                           a.toString();
                    }
                    }

                    break;
                case "EXIT":break;
                default:System.out.println("Команда введена неверно");

            }



        }


    }


}
