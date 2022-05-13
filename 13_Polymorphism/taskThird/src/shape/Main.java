package shape;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Painter simplePainter = new SimplePainter(new RegularTriangle(4,6,"-"));
        simplePainter.draw();

        List<Painter> listSimpleTriangles = new ArrayList<>(Arrays.asList(
                new RegularTriangle(4, 0, "*"),
                new MirrorRegularTriangle(5, 3, "*"),
                new ReverseMirrorTriangle(4, 0, "*")

        ));
        PainterMaster f1 = new PainterMaster(listSimpleTriangles);
        f1.draw();

        List<Painter> rocketList = new ArrayList<>(Arrays.asList(
                new IsoscelesTriangle(4, 3, "*"),
                new Rectangle(4, 5, "*", 3),
                new Trapezoid(4, 0, "*"),
                new Rectangle(4, 5, "*", 5),
                new Trapezoid(4, 0, "*")
        ));
        PainterMaster rocket = new PainterMaster(rocketList);
        rocket.draw();


        List<Painter> carList = new ArrayList<>(Arrays.asList(
                new Trapezoid(6, 8, "*"),
                new Rectangle(40, 0, "*", 6),
                new Wheels(3, 0, "*", 6, 20)
        ));
        PainterMaster car = new PainterMaster(carList);
        car.draw();
    }
}
