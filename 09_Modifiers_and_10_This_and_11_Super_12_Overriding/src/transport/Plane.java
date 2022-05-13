package transport;

public class Plane extends Vehicle {
    private int maxFlightHeight;

    public int getMaximumFlightHeight(){return this.maxFlightHeight;}
    public void setMaximumFlightHeight(int changedMaximumHeight){maxFlightHeight = changedMaximumHeight;}

    Plane(int maximumHeight, String kindOfMoving, String whatCarries, double velocity ) {
        super(kindOfMoving, whatCarries, velocity );
        this.maxFlightHeight = maximumHeight;
    }


    @Override
    public String toString(){
        return  "Maximum flight height = " + maxFlightHeight + "\n" + super.toString();
    }


    @Override
    public boolean equals(Object obj){
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Plane that = (Plane)obj;
        return this.maxFlightHeight == that.maxFlightHeight && super.equals(that);
    }
}


class PassengerPlane extends Plane {
    private int numberOfPassengerSeats;

    public int getNumberOfPassengerSeats(){return numberOfPassengerSeats;}
    public void setNumberOfPassengerSeats(int numberOfPassengerSeats){this.numberOfPassengerSeats = numberOfPassengerSeats;}

    PassengerPlane(int numOfPassengerSeats, int maxFlightHeight, String kindOfMoving, String whatCarries, double velocity) {
        super(maxFlightHeight,kindOfMoving, whatCarries, velocity );
        this.numberOfPassengerSeats = numOfPassengerSeats;
    }


    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PassengerPlane that = (PassengerPlane) obj;
        return this.numberOfPassengerSeats == that.numberOfPassengerSeats && super.equals(that);
    }


    @Override
    public String toString(){
        return "Number of passenger seats = " + numberOfPassengerSeats + "\n" + super.toString();
    }
}

class TransportPlane extends Plane {
    private double cargoCapacity;

    public double getCargoCapacity(){return cargoCapacity;}
    public void setCargoCapacity(double cargoCapacity){this.cargoCapacity = cargoCapacity;}

    TransportPlane(double cargoCapacity, int maxFlightHeight, String kindOfMoving, String whatCarries, double velocity) {
        super(maxFlightHeight,kindOfMoving, whatCarries, velocity );
        this.cargoCapacity = cargoCapacity;
    }


    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TransportPlane that = (TransportPlane) obj;
        return this.cargoCapacity == that.cargoCapacity && super.equals(that);
    }


    @Override
    public String toString() {
        return "Cargo capacity = " + cargoCapacity + "\n" + super.toString();
    }
}


class Fighter extends Plane {
    private boolean antiRadar;

    protected boolean getAntiRadar(){return antiRadar;}
    void setAntiRadar(boolean antiRadar){this.antiRadar = antiRadar;}

    Fighter(boolean antiRadar, int maxFlightHeight, String kindOfMoving, String whatCarries, double velocity) {
        super(maxFlightHeight,kindOfMoving, whatCarries, velocity );
        this.antiRadar = antiRadar;
    }


    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Fighter that = (Fighter) obj;
        return this.antiRadar == that.antiRadar && super.equals(that);
    }


    @Override
    public String toString() {
        return "Anti-radar = " + antiRadar + "\n" + super.toString();
    }
}



