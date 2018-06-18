
package ObserverPattern;

public class Main {
    public static void main(String ar[]){
        
        Cricket cr = new Cricket();
        new Live(cr);
        new Crickbuzz(cr);
        cr.set_Score(6);
        cr.set_Score(2);
        
    }
    
}
