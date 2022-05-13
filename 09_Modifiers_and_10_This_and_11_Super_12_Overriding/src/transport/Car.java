package transport;

public class Car extends Vehicle {
    private String transmissionType ;

    public String getMaximumSpeed() {
        return transmissionType ;
    }
    public void setMaximumSpeed(String transmissionType) {
        this.transmissionType  = transmissionType;
    }

    Car(String transmissionType, String kindOfMoving, String whatCarries, double velocity ) {
        super(kindOfMoving, whatCarries, velocity );
        this.transmissionType = transmissionType;
    }


    @Override
    public boolean equals(Object obj){
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Car that = (Car)obj;
        return this.transmissionType.equals(that.transmissionType) && super.equals(that);
    }

    @Override
    public String toString() {
        return  "Transmission type = " + transmissionType  + "\n" + super.toString();
    }
}


class PassengerCar extends Car {
    private int numberOfPassengerSeats;

    public int getNumberOfPassengerSeats() {
        return numberOfPassengerSeats;
    }
    public void setNumberOfPassengerSeats(int numberOfPassengerSeats) {
        this.numberOfPassengerSeats = numberOfPassengerSeats;
    }

    PassengerCar(int numOfPassengerSeats, String transmissionType, String kindOfMoving, String whatCarries, double velocity) {
        super(transmissionType,kindOfMoving, whatCarries, velocity );
        this.numberOfPassengerSeats = numOfPassengerSeats;
    }


    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PassengerCar that = (PassengerCar) obj;
        return this.numberOfPassengerSeats == that.numberOfPassengerSeats && super.equals(that);
    }

    @Override
    public String toString() {
        return "Number of passenger seats = " + numberOfPassengerSeats + "\n" + super.toString();
    }
}


class Bus extends Car {
    private String busNumber;

    public String getBusNumber() {
        return busNumber;
    }
    public void setBusNumber(String changedBusNumber) {
        busNumber = changedBusNumber;
    }

    Bus(String busNumber, String transmissionType, String kindOfMoving, String whatCarries, double velocity) {
        super(transmissionType,kindOfMoving, whatCarries, velocity );
        this.busNumber = busNumber;
    }


    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Bus that = (Bus) obj;
        return this.busNumber.equals(that.busNumber) && super.equals(that);
    }

    @Override
    public String toString() {
        return "Bus number = " + busNumber + "\n" + super.toString();
    }
}


class Truck extends Car {
    private double cargoCapacity;

    public double getCargoCapacity(){return cargoCapacity;}
    public void setCargoCapacity(double cargoCapacity){this.cargoCapacity = cargoCapacity;}

    Truck(double cargoCapacity, String transmissionType, String kindOfMoving, String whatCarries, double velocity) {
        super(transmissionType,kindOfMoving, whatCarries, velocity );
        this.cargoCapacity = cargoCapacity;
    }


    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Truck that = (Truck) obj;
        return this.cargoCapacity == that.cargoCapacity && super.equals(that);
    }

    @Override
    public String toString() {
        return "Cargo capacity = " + cargoCapacity + "\n" + super.toString();
    }
}

