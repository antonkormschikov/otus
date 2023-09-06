import animals.*;

import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;


import animals.birds.Duck;
import animals.data.AnimalData;
import animals.data.CommandsData;
import animals.pets.Cat;
import animals.pets.Dog;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

      String line=null;
        List<Animal> animals = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

            String name=null;
            int age=0;
            double weight=0;
            String color=null;

      //Animal animal = new Factory(name, age, weigth, color);


        while (true){
            System.out.println("Введите команду add/list/exit");
            String comIn = scanner.nextLine().toUpperCase().trim();
            boolean isCommandExist = false;
            for (CommandsData commandsData: CommandsData.values()){
                if (commandsData.name().equals(comIn)){
                    isCommandExist=true;
                    break ;
                }
            }
            if (!isCommandExist){
                System.out.printf("Комманда %s не найдена",comIn);
                System.out.println("");
                continue;
            }

            CommandsData commandsData = CommandsData.valueOf(comIn);

            switch (commandsData){
                case ADD:{
                    System.out.println("Какое живоное добавить? (CAT, DOG,DUCK)");
                    AnimalData animalData = AnimalData.valueOf(comIn);

                    break;
                }
                case LIST:{
                    if (animals.isEmpty()) {
                        System.out.println("Список живоных пуст");
                    } else {
                        for (Animal a : animals) {
                            a.toString();
                        }

                }
                    break;
                }
                case EXIT:{
                    System.exit(0);
                }
            }



        /*    line=scanner.nextLine().toUpperCase().trim();
            if (line.equals("ADD")) {
                System.out.println("Какое живоное добавить? (CAT, DOG,DUCK)");
                line=scanner.nextLine().toUpperCase().trim();
                if (line.equals("DOG")) {
                    System.out.println("Введите имя?");
                    name = "sdfgh";//scanner.nextLine().toString();
                    System.out.println("Введите возраст?");
                    age = 5;//(int)scanner.nextInt();
                    System.out.println("Введите вес?");
                    weight = 12.5;//(double) scanner.nextDouble();
                    System.out.println("Введите цвет?");
                    color = "черный";//scanner.nextLine().toString();
                    animals.add(new Dog(name, age, weight, color));
                } else if (line.equals("CAT")) {
                    System.out.println("Введите имя?");
                    name = scanner.nextLine().toString();
                    System.out.println("Введите возраст?");
                    age = (int) scanner.nextInt();
                    System.out.println("Введите вес?");
                    weight = (double) scanner.nextDouble();
                    System.out.println("Введите цвет?");
                    color = scanner.nextLine().toString();
                    animals.add(new Cat(name, age, weight, color));
                } else if (line.equals("DUCK")) {
                    System.out.println("Введите имя?");
                    name = scanner.nextLine().toString();
                    System.out.println("Введите возраст?");
                    age = (int) scanner.nextInt();
                    System.out.println("Введите вес?");
                    weight = (double) scanner.nextDouble();
                    System.out.println("Введите цвет?");
                    color = scanner.nextLine().toString();
                    animals.add(new Duck(name, age, weight, color));
                } else {
                    System.out.println("Неверный тип животного");
                }
            }else if (line.equals("LIST")) {
                if (animals.isEmpty()) {
                    System.out.println("Список живоных пуст");
                } else {
                    for (Animal a : animals) {
                        a.toString();
                    }
                }
            }else if (line.equals("EXIT")) {
                System.exit(0);
            } else {
                System.out.println("Команда введена неверно");
            }*/

            }



        }


    }



