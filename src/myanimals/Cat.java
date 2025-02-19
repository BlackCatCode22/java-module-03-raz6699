package myanimals;

public class Cat
{
    public static final int MAX_LIVES = 9;
    private static int catCount = 0;
    String name;
    int age;
    int livesRemaining;

    public void meow(){
        System.out.println("Meow");
    }

    public Cat () {
        catCount++;
        livesRemaining = MAX_LIVES;
        System.out.println("Total Cats: " + catCount);
    }

    public static int getCatCount() {
        return catCount;
    }
}
