package madmeg.rng;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class run {
    public static void main(String[] args) throws FileNotFoundException {
        int numOfBlazesKilled = 305; // so this is 305 blazes killed
        int numOfBarters = 262; // this is 262 gold thrown
        int numOfTimesLooped = 1000000; // this is the number of time the calculations loops

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of blazes killed > ");
        numOfBlazesKilled = sc.nextInt();
        System.out.print("Enter the number of gold thrown > ");
        numOfBarters = sc.nextInt();
        System.out.print("Enter the number of times too loop > ");
        numOfTimesLooped = sc.nextInt();


        int blazeSum = 0;
        int barterSum = 0;

        List<Integer> blazeRods = new ArrayList<Integer>();
        List<Integer> enderPearlBarters = new ArrayList<Integer>();

        for(int i=0; i < numOfTimesLooped; i++) { //loops
            blazeRods.add(BlazeRngCalculation.calculateDrops(numOfBlazesKilled));
            enderPearlBarters.add(EnderPearlBarterCalculation.calculateNumberOfBarters(numOfBarters));
        }

        blazeSum = blazeRods.stream().mapToInt(Integer::intValue).sum(); // adds all the numbers together
        barterSum = enderPearlBarters.stream().mapToInt(Integer::intValue).sum();


        System.out.println("This calculation was done " + numOfTimesLooped + " times");

        System.out.println("\n---------------BLAZE----------------");

        System.out.println("The blaze rod average drop per " + numOfBlazesKilled + " blazes killed is " + blazeSum/blazeRods.size() + " \nThe highest blaze rod count is " + Collections.max(blazeRods) + " \nthe smallest blaze rod count is " + Collections.min(blazeRods));

        System.out.println("\n---------------BARTER---------------");

        System.out.println("The ender Pearl barter average per " + numOfBarters + " gold droped is " + barterSum/blazeRods.size() + " \nThe highest ender pearl barter count is " + Collections.max(enderPearlBarters) + " \nthe smallest ender pearl barter count is " + Collections.min(enderPearlBarters));

        System.out.println("\n----------------CSV-----------------");
        CsvWriter.run(blazeRods, enderPearlBarters); //writes the csv
    }
}
