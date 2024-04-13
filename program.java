// create interfaces
interface vehicle {
    public void vehicleMessage();
    public void vehicleColor();
}

class Car implements vehicle {
    public void vehicleMessage() {
        System.out.println("This is a vehicle message");
         }
    public void vehicleColor() {
        System.out.println("The vehice color is yellow");
    }
    }

    class program {
        public static void main(String[] args) {
            Car newCar = new Car();
            newCar.vehicleMessage();
            newCar.vehicleColor();
        }
    }