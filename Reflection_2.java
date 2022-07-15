package four.task;

public class Reflection_2 {
    public static void main(String[] args) {

        Primary primary = new Primary();

        primary.powerX();
        primary.powerY();

        double x = primary.getX();
        double y = primary.getY();

        System.out.println(primary);

    }
}
