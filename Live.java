
package ObserverPattern;

public class Live extends Umpire{
    
   public Live(Cricket cr){
          this.cr=cr;
        cr.add(this);
   }
   
    public void update(){
        System.out.println("live score is "+cr.get_Score());
                
    }
}
