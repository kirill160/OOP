package Kirill.PracticOOP.Animal;

public class Main {
    public static void main(String[] args) {
        Veterinarian v =  new Animal();
        Animal[] animals = {new Dog("мясо", "дом", "собака"), new Cat("мышь", "дом", "кот"), new Horse("трава", "хлев", "лошадь")};
        for (Animal an :animals) {
            v.treatAnimal(an);
        }
        }
    }


