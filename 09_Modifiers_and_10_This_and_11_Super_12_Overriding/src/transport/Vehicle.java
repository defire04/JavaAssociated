package transport;


import java.util.Objects;

public class Vehicle {
    private String kindOfMoving ;
    private String whatCarries;
    private double velocity;


    public String getKindOfMoving() {
        return kindOfMoving;
    }
    public String getWhatCarries() {
        return whatCarries;
    }
    public double getVelocity(){
        return velocity;
    }


    public void setKindOfMoving(String kindOfMoving) {
        this.kindOfMoving = kindOfMoving;
    }
    public void setWhatCarries(String changedWhatTransports) {
        whatCarries = changedWhatTransports;
    }
    public void setVelocity(double velocity){
        this.velocity = velocity;
    }


    public Vehicle() {
    }


    Vehicle(String kindOfMoving, String whatCarries, double velocity) {
        this.kindOfMoving = kindOfMoving;
        this.whatCarries = whatCarries;
        this.velocity = velocity;
    }


    @Override
    public boolean equals(Object obj){
        Vehicle vehicle = (Vehicle) obj;
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return  this.kindOfMoving.equals(vehicle.kindOfMoving) &&
                this.whatCarries.equals(vehicle.whatCarries) &&
                this.velocity == vehicle.velocity;
    }




    @Override
    public int hashCode() {
        return Objects.hash(kindOfMoving, whatCarries, velocity);
    }

    @Override
    public String toString() {
        return "Kind Of Moving = " + kindOfMoving + "\n" +
                "What Carries = " + whatCarries + "\n" +
                "Velocity = " + whatCarries + "\n";
    }
}
