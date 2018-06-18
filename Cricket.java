
package ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class Cricket {
    
   List<Umpire> um = new ArrayList<Umpire>(); 
   protected int score;
   
   public void set_Score(int score){
       this.score=score;
       refresh();
       
   }
   
   public int get_Score(){
       return score;
   }
   
   public void add(Umpire ump){
       um.add(ump);
   }
   
   public void remove(Umpire ump){
       if(um.contains(ump))
       um.remove(ump);
   }
   
   public void refresh(){
       for(Umpire u:um){
           u.update();
       }
   }
}
