class Animal {
    String name;
    int age;

    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age + " years");
    }
}

class Lion extends Animal {
    int prideSize;

    Lion(String name, int age, int prideSize) {
        super(name, age);
        this.prideSize = prideSize;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Pride Size: " + prideSize);
    }
}

class Parrot extends Animal {
    boolean canTalk;

    Parrot(String name, int age, boolean canTalk) {
        super(name, age);
        this.canTalk = canTalk;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Can Talk: " + (canTalk ? "Yes" : "No"));
    }
}

public class ZooDemo {
    public static void main(String[] args) {
        Lion lion = new Lion("Simba", 5, 10);
        Parrot parrot = new Parrot("Polly", 2, true);

        lion.displayInfo();
        System.out.println();
        parrot.displayInfo();
    }
}
