package Kirill.PracticOOP.Animal;

public class Cat extends Animal{
    private String typeAnimal;
    public Cat(String food, String location, String typeAnimal) {
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
        return "Cat{" +
                "typeAnimal='" + typeAnimal + '\'' +
                ", food='" + food + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
