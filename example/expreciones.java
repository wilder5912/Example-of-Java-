
/**
 * Write a description of class expreciones here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class expreciones
{
  
public static void main(String [] args){

  //  String exprecion= "^[0-9]{9}$";  //valida numeros
//
  
//String exprecion= "(^[0-9]{9})(@)([A-za-z]{2})(\\.)([a-z]{3})(\\s)([-])([0-9]{2}$)";
  
String exprecion= "(\\d{1,2})(/)(\\d{1,2})(/)(\\d{4})";

     Pattern p = Pattern.compile(exprecion);
      
      // get a matcher object
     // Matcher m = p.matcher("123456789@as.com -11"); 
     // INPUT = m.replaceAll(REPLACE);
      Matcher m = p.matcher("90/09/1509"); 
     System.out.println(m.find());
}

}
