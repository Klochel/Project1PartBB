/**
 * Created by Kevin on 9/17/2017.
 */
import java.util.*;
import java.io.*;

public class TestArts {

    public static void main(String[] args, Scanner input) {

        ArrayList<Artist> artistList = new ArrayList<>();
        try {
            File file = new File("p1artist.txt");
            File outFile = new File("p1arts_out.txt");
            input = new Scanner(file).useDelimiter(("[\\t\\n]"));
            PrintWriter writer = new PrintWriter(outFile);

           /*
              Put artist data in array, print art line, search array for matching ID, print artist with that ID, repeat
             */

            while (input.hasNext()) {
                int artistID = input.nextInt();


                // Artist a = new Artist(artistID, artistName, artistTitle, artistValue);
                //writer.println(a);
                //System.out.println(a);
                //artistList.add(a);
            }
            input.close();
            writer.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

