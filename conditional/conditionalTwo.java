public class conditionalTwo {
    static boolean checkFev(double a) {
        return (a > 100) ? true : false;
    }
    public static void main(String[] args) {
        double temp = 103.5;

        if (checkFev(temp)){
            System.out.println("You have fever");
        }else{
            System.out.println("You don't have fever");
        }
    }
    
}