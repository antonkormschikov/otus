public class Animal {
    String name;
    int age;
    int weight;
    String color;

    public Animal(String name, int age, int weight, String color) {
    }

    public Animal() {
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
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

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void Say(){
        System.out.println("Я говорю");
    }
    public void Go(){
        System.out.println("Я иду");
    }
    public void Drink(){
        System.out.println("Я пью");
    }
    public void Eat(){
        System.out.println("Я ем");
    }


    @Override
    public String toString() {
        return "Привет! Меня зовут " +name+
                 ", мне " + age +" лет(/год/года), "+
                "я вешу " + weight + "кг, " +
                "мой цвет - " + color;
    }
}


