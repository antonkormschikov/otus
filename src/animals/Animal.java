package animals;

public class Animal {
    String name;
    int age;
    double weight;
    String color;

    public Animal(String name, int age, double weight, String color) {
        this.name=name;
        this.age=age;
        this.weight=weight;
        this.color=color;
    }

    public Animal() {
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void say(){
        System.out.println("Я говорю");
    }
    public void go(){
        System.out.println("Я иду");
    }
    public void drink(){
        System.out.println("Я пью");
    }
    public void eat(){
        System.out.println("Я ем");
    }



    public void toString(String name,int age, double weight,String color) {
        System.out.println("Привет! Меня зовут " +name+
                 ", мне " + age +" лет(/год/года), "+
                "я вешу " + weight + "кг, " +
                "мой цвет - " + color);
    }
}


