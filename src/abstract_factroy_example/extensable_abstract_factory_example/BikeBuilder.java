
package abstract_factroy_example.extensable_abstract_factory_example;

/**
 * @author bethan
 */
public class BikeBuilder {

    public static void main(String[] args) {

        createBikeWithExtensibleAbstractFactory("road bike");

    }

    public static void createBikeWithExtensibleAbstractFactory(String type) {

        BikeFactory bikeFactory = FactoryCreator.createFactory(type);
        Tire tireFront = (Tire) bikeFactory.create("tire");
        tireFront.getDescription();
        Tire tireBack = (Tire) bikeFactory.create("tire");
        tireBack.getDescription();
        Handlebar handlebar = (Handlebar) bikeFactory.create("handlebar");
        handlebar.getDescription();

    }

}
