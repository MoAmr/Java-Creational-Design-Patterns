package prototype.example;

public class Main {

    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit();
        rabbit.setAge(8);
        Rabbit copiedRabbit = rabbit.clone();
        System.out.println("Age of the first rabbit: " + rabbit.getAge());
        System.out.println("Age of the copied rabbit: " + copiedRabbit.getAge());
    }
}
