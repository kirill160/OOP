package Kirill.PracticOOP.Animal;

public class Animal extends Veterinarian  {
    protected String food;
    protected String location;
    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }
    public Animal(){

    }
    public void makeNoise (){
        System.out.println("Такое животное кричит");
    }
    public void eat(){
        System.out.println("Такое животное ест");

    }
    public void sleep(){
        System.out.println("такое животное спит");

    }


    public String getFood() {
        return food;
    }

    public String getLocation() {
        return location;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "food='" + food + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
