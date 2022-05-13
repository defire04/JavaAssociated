package shape;

public class SimplePainter extends Painter {
    Painter shape;

    SimplePainter(Painter shape) {
        this.shape = shape;
    }

    @Override
    public void draw() {
        shape.draw();
    }
}


// Обычный треугольник №1
class RegularTriangle extends Painter {
    RegularTriangle(int size, int shifts, String symbol) {
        super(size, shifts, symbol);
    }

    @Override
    public void draw() {
        for (int row = 0; row < getSize(); row++) {

            printShiftsAndSpace(getShifts());
            printSymbol(getSymbol(), row + 1);

            System.out.println();
        }
    }
}

// Перевернутый треугольник №2
class ReverseTriangle extends Painter {
    ReverseTriangle(int size, int shifts, String symbol) {
        super(size, shifts, symbol);
    }

    @Override
    public void draw() {
        for (int row = 0; row < getSize(); row++) {

            printShiftsAndSpace(getShifts());
            printSymbol(getSymbol(), getSize() - row);

            System.out.println();
        }
    }
}


// Перевернутый зеркальный треугольник №3
class ReverseMirrorTriangle extends Painter {
    ReverseMirrorTriangle(int size, int shifts, String symbol) {
        super(size, shifts, symbol);
    }

    @Override
    public void draw() {
        for (int row = 0; row < getSize(); row++) {

            printShiftsAndSpace(row + getShifts());
            printSymbol(getSymbol(), getSize() - row);

            System.out.println();
        }
    }
}


// Зеркальный обычный треугольник №4
class MirrorRegularTriangle extends Painter {
    MirrorRegularTriangle(int size, int shifts, String symbol) {
        super(size, shifts, symbol);
    }

    @Override
    public void draw() {
        for (int row = 0; row < getSize(); row++) {

            printShiftsAndSpace(getSize() - row - 1 + getShifts());
            printSymbol(getSymbol(), row + 1);

            System.out.println();
        }
    }
}

// Прямоугольник
class Rectangle extends Painter {
    int columns;

    Rectangle(int size, int shifts, String symbol, int columns) {
        super(size, shifts, symbol);
        this.columns = columns;
    }

    public void draw() {
        for (int row = 0; row < columns - 1; row++) {

            printShiftsAndSpace(getShifts());
            printSymbol(getSymbol(), getSize());

            System.out.println();
        }
    }
}

// Равнобедренный треугольник
class IsoscelesTriangle extends Painter {
    IsoscelesTriangle(int size, int shifts, String symbol) {
        super(size, shifts, symbol);
    }

    @Override
    public void draw() {
        for (int row = 0; row < getSize(); row++) {

            // Треугольник зеркальный обычному
            printShiftsAndSpace(getSize() - row - 1 + getShifts());
            printSymbol(getSymbol(), row + 1);

            // Треугольник обычный
            printSymbol(getSymbol(), row);
            System.out.println();
        }
    }
}

// Трапеция
class Trapezoid extends Painter {
    Trapezoid(int size, int shifts, String symbol) {
        super(size, shifts, symbol);
    }

    @Override
    public void draw() {
        for (int row = 0; row < getSize(); row++) {

            // Треугольник зеркальный обычному
            printShiftsAndSpace(getSize() - row - 1 + getShifts());
            printSymbol(getSymbol(), row + 1);
            System.out.print(" ");

            // Прямоугольник
            printSymbol(getSymbol(), getSize());
            System.out.print(" ");

            // Треугольник обычный
            printSymbol(getSymbol(), row + 1);

            System.out.println();
        }
    }
}


// Колеса для машины
class Wheels extends Painter {
    int spaceFirst;
    int spaceBetweenWheels;

    Wheels(int size, int shifts, String symbol, int spaceFirst, int spaceBetweenWheels) {
        super(size, shifts, symbol);
        this.spaceFirst = spaceFirst;
        this.spaceBetweenWheels = spaceBetweenWheels;
    }


    @Override
    public void draw() {
        for (int row = 0; row < getSize(); row++) {

            printShiftsAndSpace(spaceFirst);
            printSymbol(getSymbol(), getSize());

            printShiftsAndSpace(spaceBetweenWheels);

            printShiftsAndSpace(getShifts());
            printSymbol(getSymbol(), getSize());

            System.out.println();
        }
    }
}