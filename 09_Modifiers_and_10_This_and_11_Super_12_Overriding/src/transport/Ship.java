package transport;

public class Ship extends Vehicle {

    private double draft;

    public double getDraft(){return draft;}
    public void setDraft(double draft){
        this.draft = draft;}


    Ship(double draft,String kindOfMoving, String whatCarries, double velocity ) {
        super(kindOfMoving, whatCarries, velocity );
        this.draft = draft;
    }


    @Override
    public boolean equals(Object obj){
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Ship that = (Ship)obj;
        return this.draft == that.draft && super.equals(that);
    }

    @Override
    public String toString() {
        return "Ship draft  = " + draft + "\n" + super.toString();
    }
}


class PassengerLiner extends Ship {
    private int numberOfPassengerSeats;

    public int getNumberOfPassengerSeats() {
        return numberOfPassengerSeats;
    }
    public void setNumberOfPassengerSeats(int numberOfPassengerSeats) {
        this.numberOfPassengerSeats = numberOfPassengerSeats;
    }

    PassengerLiner(int numOfPassengerSeats, int draft, String kindOfMoving, String whatCarries, double velocity) {
        super(draft,kindOfMoving, whatCarries, velocity );
        this.numberOfPassengerSeats = numOfPassengerSeats;
    }


    @Override
    public boolean equals(Object obj){
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PassengerLiner that = (PassengerLiner)obj;
        return this.numberOfPassengerSeats == that.numberOfPassengerSeats && super.equals(that);
    }

    @Override
    public String toString() {
        return "Number of passenger seats = " + numberOfPassengerSeats + "\n" + super.toString();
    }
}


class Tug extends Ship {
    private int maximumCanTowWeight;

    public int getMaximumCanTowWeight(){return maximumCanTowWeight;}
    public void setMaximumCanTowWeight(int maximumCanTowWeight){this.maximumCanTowWeight = maximumCanTowWeight;}

    Tug(int maximumCanTowWeight, int draft, String kindOfMoving, String whatCarries, double velocity) {
        super(draft,kindOfMoving, whatCarries, velocity );
        this.maximumCanTowWeight = maximumCanTowWeight;
    }


    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Tug that = (Tug) obj;
        return this.maximumCanTowWeight == that.maximumCanTowWeight && super.equals(that);
    }

    @Override
    public String toString() {
        return "Maximum can tow weight = " + maximumCanTowWeight + "\n" + super.toString();
    }
}


class Tanker extends Ship {
    private double cargoCapacity;

    public double getCargoCapacity(){return cargoCapacity;}
    public void setCargoCapacity(double cargoCapacity){this.cargoCapacity = cargoCapacity;}

    Tanker(double cargoCapacity, int draft, String kindOfMoving, String whatCarries, double velocity) {
        super(draft,kindOfMoving, whatCarries, velocity );
        this.cargoCapacity = cargoCapacity;
    }


    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Tanker that = (Tanker) obj;
        return this.cargoCapacity == that.cargoCapacity && super.equals(that);
    }

    @Override
    public String toString() {
        return "Cargo capacity = " + cargoCapacity + "\n" + super.toString();
    }
}

