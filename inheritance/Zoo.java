class Animal {
    String name;
    int age;
    String dietType;

    Animal(String name, int age, String dietType) {
        this.name = name;
        this.age = age;
        this.dietType = dietType;
    }

    void eat() {
        System.out.println(name + " is eating.");
    }

    void sleep() {
        System.out.println(name + " is sleeping.");
    }
}

class Mammal extends Animal {
    String furColor;

    Mammal(String name, int age, String dietType, String furColor) {
        super(name, age, dietType);
        this.furColor = furColor;
    }

    void run() {
        System.out.println(name + " runs on land. Fur color: " + furColor);
    }
}

class Bird extends Animal {
    double wingspan;

    Bird(String name, int age, String dietType, double wingspan) {
        super(name, age, dietType);
        this.wingspan = wingspan;
    }

    void fly() {
        System.out.println(name + " flies with wingspan: " + wingspan + " meters");
    }
}

class Reptile extends Animal {
    boolean venomous;

    Reptile(String name, int age, String dietType, boolean venomous) {
        super(name, age, dietType);
        this.venomous = venomous;
    }

    void crawl() {
        System.out.println(name + " crawls. Venomous: " + venomous);
    }
}

public class Zoo {
    public static void main(String[] args) {

        Mammal m = new Mammal("Lion", 5, "Carnivore", "Golden");
        Bird b = new Bird("Eagle", 3, "Carnivore", 2.5);
        Reptile r = new Reptile("Snake", 2, "Carnivore", true);

        m.eat();
        m.sleep();
        m.run();

        System.out.println();

        b.eat();
        b.fly();

        System.out.println();

        r.eat();
        r.crawl();
    }
}