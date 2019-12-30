package singleton.example.java.collection.example;

import java.util.Collections;
import java.util.List;

public class ResourceManager {

    public static void main(String[] args) {

        PrintSpooler spooler = new PrintSpooler();

        List<PrintSpooler> spoolers = Collections.singletonList(spooler);

        //Note: processResources() method here only works with a list that has only one resource in it.
        processResources(spoolers);

        PrintSpooler spooler2 = new PrintSpooler();
        spoolers.add(spooler2);

    }

    /**
     * A method that takes a list of resource managers as a parameter
     */
    public static <Type> void processResources(List<Type> list) {

        for (Type p : list) {
            //Code to process resources
        }
    }
}
