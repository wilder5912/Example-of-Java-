
/**
 * Write a description of class principal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;

public class principal
{
 
    public static void main(String [] args){
        
        
        Programador d =  new Programador();
        Programador d2 =  new Programador();
        Gerente g = new Gerente();
        
        ArrayList<Empleado> l = new ArrayList<Empleado>();
        
       l.add(d);
       l.add(d2); 
       l.add(g);
       
       for(int i =0 ; i< l.size(); i++){
           l.get(i).getCalcular();
           
        }
    }

}
