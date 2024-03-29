
package abstract_factroy_example;

/**
 * @author bethan
 */
public class RoadBikeFactory extends BikeFactory {

    @Override
    public Tire createTire() {
        return new RoadBikeTire();
    }

    @Override
    public Handlebar createHandlebar() {
        return new RoadBikeHandlebar();
    }

}
