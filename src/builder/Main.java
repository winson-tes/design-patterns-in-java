package builder;

class Main {
    public static void main(String[] args) {
        // create car
        Car car = new Car.CarBuilder("red", 4).build();
     
        // create car with optional extra features!!
        Car otherCar = new Car.CarBuilder("blue", 4)
            .setCarPlayEnabled(true)
            .build();

        System.out.println(car.getColour() +  ',' + car.getWheels() +  ',' + car.isCarPlayEnabled());
        System.out.println(otherCar.getColour() +  ',' + otherCar.getWheels() +  ',' + otherCar.isCarPlayEnabled());
    }
}