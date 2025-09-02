interface DeliveryVehicle {
    double calculateCharge(int weight);
}

class Bike implements DeliveryVehicle {
    public double calculateCharge(int weight) {
        return weight * 10; // Rs.10 per kg
    }
}

class Truck implements DeliveryVehicle {
    public double calculateCharge(int weight) {
        return weight * 20; // Rs.20 per kg
    }
}

public class CourierDemo {
    public static void main(String[] args) {
        DeliveryVehicle bike = new Bike();
        DeliveryVehicle truck = new Truck();

        System.out.println("Bike Charge: ₹" + bike.calculateCharge(5));
        System.out.println("Truck Charge: ₹" + truck.calculateCharge(5));
    }
}
