package Kirill.PracticOOP.Animal;

public class Dog extends Animal{
    private String typeAnimal;

    public Dog(String food, String location, String typeAnimal) {
        super(food, location);
        this.typeAnimal = typeAnimal;
    }

    @Override
    public void makeNoise() {
        super.makeNoise();
    }

    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public String toString() {
        return "Dog{" +
                "typeAnimal='" + typeAnimal + '\'' +
                ", food='" + food + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
