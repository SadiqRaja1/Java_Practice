public class methodRidding {

    static class vehicle {
        void start () {
            System.out.println("Vehicle started");
        }
    }

    static class car extends vehicle {
        void start () {
            System.out.println("Car started");
        }
    }

    public static void main(String[] args) {
        vehicle vehCar = new car();

        vehCar.start();
    }
}