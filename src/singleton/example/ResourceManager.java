package singleton.example;

public class ResourceManager {

    public static void main(String[] args) {

        PrintSpooler spooler = PrintSpooler.getInstance();

        // First Thread
        Thread threadOne = new Thread(() -> {
            PrintSpooler s = PrintSpooler.getInstance();
        });

        // Second Thread
        Thread threadTwo = new Thread(() -> {
            PrintSpooler.getInstance();
        });

        threadOne.start();
        threadTwo.start();
    }
}
