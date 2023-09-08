package animals;

public abstract class Animal {
    private String name;
    private int age;
    private double weight;
    private String color;

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

/*public String getValidAge(int age){
        if (age<0)
}*/

public String getYearP(int age){
       int a=this.age % 10;
       if (this.age>=11 && this.age<=19){
           return "лет";
       }
       if (age==1||a==1){return "год";}
       else if (age>=5 || age==0) {return "лет";}
       else {return "года";}
}

    public String toString(String name, int age, double weight, String color) {

       return String.format("Привет! Меня зовут %s, мне %s %s, я вешу %s кг, мой цвет - %s", name, age, getYearP(age), weight, color);

    }
}


