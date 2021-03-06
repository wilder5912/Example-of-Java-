import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import java.io.*;
import java.util.Date;


public class Usuario implements Serializable {	
  private   String nombre;
  private transient String password;
 
  public Usuario(String nombre, String password) {
    this.nombre = nombre;
    this.password = password;
  }
 
  public String toString() {
    String pwd = (password == null) ? "(n/a)" : password;
    return " " + nombre + "  " + pwd;
  }
  
 public static void main(String arg[]){
        Usuario miusuario = new Usuario("Victor", "1234");
        System.out.println(miusuario);
        ObjectOutputStream o = null;
    ObjectInputStream in = null;
    try {
        in = new ObjectInputStream(new FileInputStream("user.out"));
    } catch (IOException e) {
        e.printStackTrace();
    }
    System.out.println("Recupero el objeto " + new Date());
    try {
        miusuario = (Usuario) in.readObject();
    } catch (IOException e) {
        e.printStackTrace();
    } catch (ClassNotFoundException e) {
        e.printStackTrace();
    }
    System.out.println(miusuario);
    }
    
    
  
}