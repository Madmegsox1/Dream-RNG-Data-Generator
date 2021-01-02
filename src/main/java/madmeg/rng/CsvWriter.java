package madmeg.rng;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;

public class CsvWriter {

    /**
     * @param blazeRods the blaze rod drop list
     * @param enderPearlBarters the ender pearl drop list
     * @throws FileNotFoundException
     *
     * this writes the two lists to a csv file aka a edxel file so you can see all the data
     */


    public static void run(List<Integer> blazeRods, List<Integer> enderPearlBarters) throws FileNotFoundException {
        try (PrintWriter writer = new PrintWriter(new File("rng.csv"))) {
            StringBuilder sb = new StringBuilder();
            sb.append("ender_pearl_barters");
            sb.append(',');
            sb.append("blaze_rods");
            sb.append('\n');


            for (int i=0; i < blazeRods.size(); i++){
                sb.append(enderPearlBarters.get(i));
                sb.append(',');
                sb.append(blazeRods.get(i));
                sb.append('\n');
            }
            writer.write(sb.toString());

            System.out.println("Done writing csv file!");
        }catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
