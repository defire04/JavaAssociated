package shape;

abstract public class Painter {

    private int size;
    private int shifts;
    private String symbol;

    Painter(int size, int shifts, String symbol) {
        this.size = size;
        this.shifts = shifts;
        this.symbol = symbol;
    }
    Painter() {
    }

    /**
     * Getters
     */
    public int getSize() {
        return size;
    }
    public int getShifts() {
        return shifts;
    }
    public String getSymbol() {
        return symbol;
    }

    /**
     * Setters
     */
    protected void setSize(int size) {
        this.size = size;
    }
    protected void setShifts(int shifts) {
        this.shifts = shifts;
    }
    protected void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    abstract public void draw();

    /** Для принта символа */
    public void printSymbol(String symbol, int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(symbol);
        }
    }
    /** Для отступов фигуры от поля и пробелов */
    public void printShiftsAndSpace(int count) {
        for (int i = 0; i < count; i++) {
            System.out.print(" ");
        }
    }

}
