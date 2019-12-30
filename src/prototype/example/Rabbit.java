package prototype.example;

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

    public Rabbit() {
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
            return (Rabbit) super.clone();
        } catch (CloneNotSupportedException ex) {
            throw new AssertionError();
        }
    }
}
