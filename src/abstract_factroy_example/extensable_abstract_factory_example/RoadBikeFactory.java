
package abstract_factroy_example.extensable_abstract_factory_example;

/**
 * @author bethan
 */
public class RoadBikeFactory extends BikeFactory {

    @Override
    public BikePart create(String type) {
        if (type.equalsIgnoreCase("tire")) {
            return new RoadBikeTire();
        } else if (type.equalsIgnoreCase("handlebar")) {
            return new RoadBikeHandlebar();
        } else {
            return null;
        }
    }

}
