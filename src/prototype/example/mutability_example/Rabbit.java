package prototype.example.mutability_example;

public class Rabbit implements Cloneable {

    public enum BREED {
        HIMALAYAN,
        AMERICAN,
        MINE_REX,
        LOINHEAD,
        DUTCH
    }

    //Age in months
    private int age;
    private BREED breed;
    private Person owner;

    public Rabbit() {
    }

    public void setOwner(String name) {
        Person owner = new Person(name);
        this.owner = owner;
    }

    public Person getOwner() {
        return owner;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public BREED getBreed() {
        return breed;
    }

    public void setBreed(BREED breed) {
        this.breed = breed;
    }

    @Override
    public Rabbit clone() {
        try {
            Rabbit rabbit = (Rabbit) super.clone();
            rabbit.owner = owner.clone();
            return rabbit;
        } catch (CloneNotSupportedException ex) {
            throw new AssertionError();
        }
    }
}
