
package ObserverPattern;

public class Crickbuzz extends Umpire {
    
    public Crickbuzz(Cricket cr){
        this.cr=cr;
        cr.add(this);
    }
    
    public void update(){
        System.out.println("Crickbuzz score is "+cr.get_Score());
    }
    
}
