package ProjectEU2;

public abstract class  Car {
    /*Create a Class Car that would have the
following fields: carPrice and color and method
calculateSalePrice() which should be returning
a price of the car.
Create 2 sub classes: Sedan and Truck. The Truck
class has a field as weight and has its own
implementation of calculateSalePrice() method
in which returned price is calculated as
following: if weight>2000 then returned price
car should include 10% discount, otherwise 20%
discount.
The Sedan class has field as length and also
does it is own implementation of
calculateSalePrice(): if length of sedan is >20
feet then returned car price should include 5%
discount, otherwise 10% discount*/
    double carPrice;
    String color;
    double salePrice;

    public Car(double carPrice) {
        this.carPrice = carPrice;
    }

    double calculateSalePrice(double carPrice, int weight) {
        return salePrice;
    }

    abstract double calculateSalePrice();
}

//class Sedan extends Car {}

class Truck extends Car {
    int weight;

    Truck (double carPrice, int weight) {
        super(carPrice);
        this.weight = weight;
    }

    @Override
    double calculateSalePrice() {
        if (weight > 2000) {
            salePrice = carPrice * 0.9;
        } else {
            salePrice = carPrice * 0.8;
        } return salePrice;
    }
}
class CarTest{

    public static void main(String[] args) {
        Car car1 = new Truck(1000.0, 2500);
        System.out.println(car1.calculateSalePrice());
    }
}