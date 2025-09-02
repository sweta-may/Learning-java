class Device {
    String brand;
    double price;

    Device(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Price: ₹" + price);
    }
}

class Mobile extends Device {
    int ramSize;

    Mobile(String brand, double price, int ramSize) {
        super(brand, price);
        this.ramSize = ramSize;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("RAM Size: " + ramSize + "GB");
    }
}

class Laptop extends Device {
    int batteryLife;

    Laptop(String brand, double price, int batteryLife) {
        super(brand, price);
        this.batteryLife = batteryLife;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Battery Life: " + batteryLife + " hours");
    }
}

public class DeviceOverrideDemo {
    public static void main(String[] args) {
        Mobile m = new Mobile("iPhone", 80000, 6);
        Laptop l = new Laptop("HP", 60000, 12);

        m.displayInfo();
        System.out.println();
        l.displayInfo();
    }
}
