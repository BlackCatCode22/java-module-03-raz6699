package myanimals;

public class Animal {
    public static void main(String[] args) {

        System.out.println("Initial Cat count: " + Cat.getCatCount());

        Cat myCat = new Cat();
        myCat.meow();
        myCat.name = "Stella";
        myCat.age = 8;
        System.out.println("Max Lives: " + Cat.MAX_LIVES);
        System.out.println("Current Cat count: " + Cat.getCatCount());

        System.out.println("Initial Dog count: " + Dog.getDogCount());

        Dog myDog = new Dog();
        myDog.bark();
        myDog.name = "Max";
        myDog.age = 2;
        System.out.println("Max Lives: " + Dog.MAX_LIVES);
        System.out.println("Current Dog count: " + Dog.getDogCount());

        Dog myDog1 = new Dog();
        myDog1.bark();
        myDog1.name = "Luna";
        myDog1.age = 2;
        System.out.println("Max Lives: " + Dog.MAX_LIVES);
        System.out.println("Current Dog count: " + Dog.getDogCount());
    }
}
