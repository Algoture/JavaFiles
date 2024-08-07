import java.util.Random;

public class RandomName {
    int numNames;
    String[] firstNames = { "Umesh", "Shesh", "Abhishek", "Samyack", "Mayur", "Sainath" };
    String[] lastNames = { "Bansode", "Nagare", "Medpalli", "Nalwar", "Sutar", "Deshpande" };

    public RandomName() {
        numNames = 6;
    }
    
    public void generateName() {
        Random rd = new Random();
        String firstName = firstNames[rd.nextInt(numNames)];
        String lastName = lastNames[rd.nextInt(numNames)];
        System.out.println(firstName + " " + lastName);
    }

    public static void main(String[] args) {
        RandomName rng = new RandomName();
        System.out.println("List of random names:");
        int counter = 1;
        while (counter <= 4) {
            rng.generateName();
            counter++;

        }

    }
}