import java.util.ArrayList;
import java.util.*;
public class DominoPile {
    private ArrayList<Domino>pile;
    public DominoPile(){
        pile = new ArrayList();
    }
    public ArrayList<Domino> getPile(){
        return pile;
    }
    public void newStack6(){
        int a = 0;
        int p = 0;
        for(int i = 0; i <= 6; i++){
            for(a = p; a < 6; a++){
                pile.add(new Domino(i,a));
            }
            p++;
            pile.add(new Domino(i,a));
        }
    }
    public void shuffleOptionOne(){
        ArrayList<Domino> pileTwo = new ArrayList();
        Collections.shuffle(pile);
        for(int i = 0; i <= 6; i++){
            pileTwo.add(i,pile.get(i));
        }
    }

}