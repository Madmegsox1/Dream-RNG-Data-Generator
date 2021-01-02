package madmeg.rng;

public class EnderPearlBarterCalculation {
    /**
     * @param goldThrow the number of gold throw of the number of time the code loops
     * @return the number of ender pearl barters that happened
     */

    public static int calculateNumberOfBarters(int goldThrow){
        int min = 1;
        int max = 423;
        int numberOfBarters = 0;

        //System.out.println("Calculating with " + goldThrow + " gold throw");

        for (int i = 0; i < goldThrow; i++){ //loops for every gold throw
            int randomInt = (int) (Math.random() * (max - min + 1) + min); //calculates random int
            if(randomInt <= 20){ // if the int is < or = to 20 then an ender pearl barter happened because the chance of this happening is 20/423
                numberOfBarters++;
            }
        }
        return numberOfBarters;

    }
}
