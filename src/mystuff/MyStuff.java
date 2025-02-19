package mystuff;

public class MyStuff {
    public static void main(String[] args) {

        Driver myStuff = new Driver();
        myStuff.cardHolderName = "John Doe";
        myStuff.cardNumber = "1234 5678 9012 3456";
        myStuff.balance = 1500.75;
        myStuff.expirationDate = "12/26";
        myStuff.cvv = 123;
        myStuff.isActive = true;

        Driver myStuff2 = new Driver();
        myStuff2.cardHolderName = "Jane Smith";
        myStuff2.cardNumber = "9876 5432 1098 7654";
        myStuff2.balance = 500.25;
        myStuff2.expirationDate = "06/24";
        myStuff2.cvv = 456;
        myStuff2.isActive = false;

        System.out.println(myStuff.cardHolderName);
    }
}
