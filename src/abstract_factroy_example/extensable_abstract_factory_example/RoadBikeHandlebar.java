package abstract_factroy_example.extensable_abstract_factory_example;

/**
 * @author bethan
 */
public class RoadBikeHandlebar extends Handlebar {

    private static String type = "DROP";

    @Override
    public void getDescription() {
        System.out.println("Road bike handlebar. Type: " + type);
    }

}
