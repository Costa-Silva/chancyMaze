import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by paulo on 15/05/2016.
 */
public class chancyMaze {

    private int entrance;
    private int exit;
    private List<Corridor> corridorList;

    public chancyMaze(int entrance, int exit,int num){
        this.entrance=entrance;
        this.exit=exit;
        corridorList=new ArrayList<>(num);
    }

    public void addCorridor(Corridor corridor){
        corridorList.add(corridor);
    }

    public int problem(){
        int[] length = new int[exit+1];
        int[] via = new int[exit+1];

        for (int i=0;i<=exit;i++){
            length[i] = Integer.MAX_VALUE;
        }

        length[entrance] =0;
        via[entrance] = entrance;

        boolean changes = false;

        for (int i=1; i<=exit;i++){
            changes = updateLengths(length,via);
            if(!changes){
                break;
            }
        }

        if(changes && updateLengths(length,via)){
            return -1;
        }

        return length[exit];
    }

    private boolean updateLengths(int[] length, int[] via) {

        boolean changes=false   ;

        for(Corridor corr : corridorList){
            int tail = corr.getFrom();
            int head = corr.getTo();

            if(length[tail] < Integer.MAX_VALUE){
                int newLength = length[tail] + corr.getCoins();
                if(newLength<length[head]){
                    length[head] = newLength;
                    via[head] = tail;
                    changes = true;
                }
            }
        }

        return changes;
    }

}
