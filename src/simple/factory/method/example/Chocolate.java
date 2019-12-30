package simple.factory.method.example;

import java.util.ArrayList;

public class Chocolate extends Candy {

    @Override
    ArrayList<Candy> makeCandyPackage(int quantity) {
        ArrayList ChocolatePackage = new ArrayList<>();
        for (int i = 1; i <= quantity; i++) {
            Chocolate chocolate = new Chocolate();
            ChocolatePackage.add(chocolate);
        }

        System.out.println("One package of " + quantity + " chocolate has been made!");
        return ChocolatePackage;
    }
}
