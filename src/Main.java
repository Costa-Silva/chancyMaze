import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int[] nRoomsAndCorridors = new int[2];

        try {
            String[] numbers = in.readLine().trim().split("\\s+");

            for(int i=0;i<nRoomsAndCorridors.length;i++){
                nRoomsAndCorridors[i] = Integer.parseInt(numbers[i]);
            }

            int entrance = 0;
            int exit = nRoomsAndCorridors[0]-1;

            int numberofcorridors = nRoomsAndCorridors[1];
            ChancyMaze cM = new ChancyMaze(entrance,exit,numberofcorridors);

            for (int i =0;i<nRoomsAndCorridors[1];i++){
                String[] corridor =in.readLine().trim().split("\\s+");
                int from = Integer.parseInt(corridor[0]);
                int to = Integer.parseInt(corridor[1]);
                String object = corridor[2];
                int coins = Integer.parseInt(corridor[3]);

                int corrCoins = object.equals("B") ? coins : -coins;

                cM.addCorridor(new Corridor(from,to,corrCoins));
            }

            String output = cM.problem()>=0 ? "no" : "yes";

            System.out.println(output);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
