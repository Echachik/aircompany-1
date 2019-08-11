package Planes;



/**нельзя называть класс TypicalPlane - не несет смысловой нагрузки. Самолет должен быть военный, пасажирский и.т.д
 * и этот класс нигде не исапользуется, его стоит удалить
 */


public class TypicalPlane extends Plane {
    public TypicalPlane(String model, int maxSpeed, int maxFlightDistance, int maxLoadCapacity) {
        super(model, maxSpeed, maxFlightDistance, maxLoadCapacity);
    }

    /**
     служеюные коментарии, не стоит комитить в git
     */

    //TODO implement it later
}
