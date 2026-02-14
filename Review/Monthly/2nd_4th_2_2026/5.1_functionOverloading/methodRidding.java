public class methodRidding {

    public static class vehicle {
        void start() {
            System.out.println("Vehicle started");
        }
    }

    public static class car extends vehicle {
        void start(){
            System.out.println("Car started");
        }
    }

    public static void main (String args []) {
        vehicle car1 = new car();

        car1.start();
    }
}