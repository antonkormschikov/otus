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

            String name="";
            int age=-1;
            double weight=-1;
            String color="";

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
                    line=scanner.nextLine().toUpperCase().trim();
                 /*   AnimalData date = AnimalData.valueOf(type);
                   animals.add(new Factory(name, age, weight, color).create(date).say());*/

                   if (line.equals("DOG")) {
                        System.out.println("Введите имя?");
                       while(!scanner.hasNext("[a-zA-Z]*$")) {
                           System.out.println("Вводите только буквы!");
                           scanner.next();
                           }
                       name = scanner.next();

                       System.out.println("Введите возраст?");
                       while (!scanner.hasNextInt()) {
                           System.out.println("Вводите только целое число!");
                           scanner.next();
                       }
                       age = scanner.nextInt();

                        System.out.println("Введите вес?");
                       while (!scanner.hasNextDouble()) {
                           System.out.println("Вводите только целое число!");
                           scanner.next();
                       }
                       weight = scanner.nextDouble();

                        System.out.println("Введите цвет?");
                        while(!scanner.hasNext("[a-zA-Z]*$")) {
                            System.out.println("Вводите только буквы!");
                            scanner.next();
                        }
                       color = scanner.next();
                        Animal a =new Dog(name, age, weight, color);
                        animals.add(a);
                        a.say();
        ////////////////////////////////////////////
                    } else if (line.equals("CAT")) {
                       System.out.println("Введите имя?");
                       while(!scanner.hasNext("[a-zA-Z]*$")) {
                           System.out.println("Вводите только буквы!");
                           scanner.next();
                       }
                       name = scanner.next();

                       System.out.println("Введите возраст?");
                       while (!scanner.hasNextInt()) {
                           System.out.println("Вводите только целое число!");
                           scanner.next();
                       }
                       age = scanner.nextInt();

                       System.out.println("Введите вес?");
                       while (!scanner.hasNextDouble()) {
                           System.out.println("Вводите только целое число!");
                           scanner.next();
                       }
                       weight = scanner.nextDouble();

                       System.out.println("Введите цвет?");
                       while(!scanner.hasNext("[a-zA-Z]*$")) {
                           System.out.println("Вводите только буквы!");
                           scanner.next();
                       }
                       color = scanner.next();
                       Animal a =new Cat(name, age, weight, color);
                       animals.add(a);
                       a.say();
                        /////////////////////////////////////////////
                    } else if (line.equals("DUCK")) {
                       System.out.println("Введите имя?");
                       while(!scanner.hasNext("[a-zA-Z]*$")) {
                           System.out.println("Вводите только буквы!");
                           scanner.next();
                       }
                       name = scanner.next();

                       System.out.println("Введите возраст?");
                       while (!scanner.hasNextInt()) {
                           System.out.println("Вводите только целое число!");
                           scanner.next();
                       }
                       age = scanner.nextInt();

                       System.out.println("Введите вес?");
                       while (!scanner.hasNextDouble()) {
                           System.out.println("Вводите только число!");
                           scanner.next();
                       }
                       weight = scanner.nextDouble();

                       System.out.println("Введите цвет?");
                       while(!scanner.hasNext("[a-zA-Z]*$")) {
                           System.out.println("Вводите только буквы!");
                           scanner.next();
                       }
                       color = scanner.next();
                       Animal a =new Duck(name, age, weight, color);
                       animals.add(a);
                       a.say();

                   }
                           else {
                        System.out.println("Неверный тип животного");
                    }

                    break;
                }
                case LIST:{
                    if (animals.isEmpty()) {
                        System.out.println("Список живоных пуст");
                    } else {
                        for (Animal a : animals) {
                           System.out.println(a.toString(a.getName(),a.getAge(),a.getWeight(),a.getColor()));
                        }

                }
                    break;
                }
                case EXIT:{
                    System.exit(0);
                }
            }
           }



        }


    }



