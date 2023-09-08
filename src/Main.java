import animals.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import animals.data.AnimalData;
import animals.data.CommandsData;

public class Main {
    public static void main(String[] args) {

      String line=null;
        List<Animal> animals = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

            String name="";
            int age=-1;
            double weight=-1;
            String color="";

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
                        line = scanner.nextLine().toUpperCase().trim();

                        boolean isAnimalExists = false;
                        for (AnimalData animalData : AnimalData.values()) {
                            if (animalData.name().equals(line)) {
                                isAnimalExists = true;
                                break;
                            }
                        }
                        if (!isAnimalExists) {
                            System.out.printf("Неверный тип живоного %s", line);
                            System.out.println("");
                            continue;
                        }

                        AnimalData data = AnimalData.valueOf(line);
                        Animal a = new Factory(name, age, weight, color).create(data);
                        animals.add(a);
                        a.say();

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



