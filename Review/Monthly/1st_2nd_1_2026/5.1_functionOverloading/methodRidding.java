public class methodRidding {

    static class vehicle {
        void start () {
            System.out.println("Start Engine");
        }
    }

    static class car extends vehicle {
        void start () {
            System.out.println("Start car Engine");
        }
    }
    public static void main(String[] args) {
        vehicle newCar = new car();

        newCar.start();
    }
}