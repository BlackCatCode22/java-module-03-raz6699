package myanimals;

public class Dog
{
    public static final int MAX_LIVES = 9;
    private static int dogCount = 0;
    String name;
    int age;
    int livesRemaining;

    public void bark(){
        System.out.println("Bark");
    }

    public Dog () {
        dogCount++;
        livesRemaining = MAX_LIVES;
        System.out.println("Total Dogs: " + dogCount);
    }

    public static int getDogCount() {
        return dogCount;
    }
}