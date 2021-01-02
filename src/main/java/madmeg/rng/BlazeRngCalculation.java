package madmeg.rng;

public class BlazeRngCalculation {

    /**
     * @param numOfBlazesKilled the number of blazes killed or the number of times the code loops
     * @return the number of blaze rods dropped
     */
    public static int calculateDrops(int numOfBlazesKilled){
        int min = 1;
        int max = 2;
        int numberOfBlazeRodDrops = 0;

        //System.out.println("Calculating with " + numOfBlazesKilled + " blazes killed");
        for (int i = 0; i < numOfBlazesKilled; i++) { //Loops for every blaze killed
            int randomInt = (int) (Math.random() * (max - min + 1) + min); //calculates random int
            if(randomInt == 2){
                numberOfBlazeRodDrops++; // as the is a %50 of a blaze rod drop then there is a %50 of getting 2 so every 1 drop the getting the number 2
            }
        }

        return numberOfBlazeRodDrops;

    }
}
