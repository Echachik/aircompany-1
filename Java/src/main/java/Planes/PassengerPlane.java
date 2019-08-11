package Planes;

import java.util.Objects;

/**
 плохие коментарии  FIELDS, CONSTRUCTORS,METHODS . разработчик и так знает где находсятся поля и методы,
 коментарии должны вносить в код какие-нибудь пояснения.
 */

public class PassengerPlane extends Plane{


    private int passengersCapacity;


    public PassengerPlane(String model, int maxSpeed, int maxFlightDistance, int maxLoadCapacity, int passengersCapacity) {
        super(model, maxSpeed, maxFlightDistance, maxLoadCapacity);
        this.passengersCapacity = passengersCapacity;
    }



    public int getPassengersCapacity() {
        return passengersCapacity;
    }

    @Override
    public String toString() {
        return super.toString().replace("}",
                ", passengersCapacity=" + passengersCapacity +
                '}');
    }

    /**
     оставлсять закоментированый код и отправлять это в git считается плохой практикой
     */




    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PassengerPlane)) return false;
        if (!super.equals(o)) return false;
        PassengerPlane plane = (PassengerPlane) o;
        return passengersCapacity == plane.passengersCapacity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), passengersCapacity);
    }
}
