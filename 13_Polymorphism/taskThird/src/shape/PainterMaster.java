package shape;

import java.util.List;

class PainterMaster extends Painter {
    List<Painter> simpleShapeList;

    PainterMaster(List<Painter> simpleShapeList) {
        this.simpleShapeList = simpleShapeList;
    }

    @Override
    public void draw() {
        for (Painter figure : simpleShapeList) {
            figure.draw();
        }
    }
}
