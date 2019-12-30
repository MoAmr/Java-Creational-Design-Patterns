package prototype.example.mutability_example;

public class Main {

    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit();
        rabbit.setOwner("Mohammed");
        Rabbit copiedRabbit = rabbit.clone();
        System.out.println("Name of the first owner: " + rabbit.getOwner().getName());
        System.out.println("Name of the second owner: " + copiedRabbit.getOwner().getName());
        copiedRabbit.getOwner().setName("Ali");
        System.out.println("Name of the first owner: " + rabbit.getOwner().getName());
        System.out.println("Name of the second owner: " + copiedRabbit.getOwner().getName());
    }
}
