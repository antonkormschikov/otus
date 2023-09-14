package animals.tools;

import animals.Factory;

import java.util.Scanner;

public class GetAnimalData {
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
}
