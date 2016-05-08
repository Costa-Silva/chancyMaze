import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {


        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

            String[] firstInputLine = in.readLine().split("\\s");

            int numberOfRooms = Integer.parseInt(firstInputLine[0]);
            int numberOfCorridors = Integer.parseInt(firstInputLine[1]);


            for (int i = 0; i < numberOfCorridors ; i++) {
                String[] allowedToMove = in.readLine().split("\\s");
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
