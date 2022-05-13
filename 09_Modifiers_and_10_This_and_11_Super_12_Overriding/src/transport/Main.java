package transport;

import static java.lang.System.out;

public class Main {

    public static void main(String[] args) {

        Plane p1 = new Fighter(true, 2000, "Fly", "Bombs", 1000);
        out.println(p1);

        Plane p2 = new PassengerPlane(40, 2000, "Fly", "People", 500);

        Fighter f1 = new Fighter(true, 2000, "Fly", "Bombs", 1000);
        out.println(p1.equals(f1));
    }
}
