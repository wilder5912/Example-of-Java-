public class EjemploPropiaExcepcion {
 
    public static void main(String[] args) {
 
        int num;
 
        try {
 
            num = 50000;
 
            if (num >= 0 && num <= 10) {
                throw new MiExcepcion(111);
            } else if (num > 10 && num <= 20) {
                throw new MiExcepcion(222);
            } else if (num > 20 && num <= 30) {
                throw new MiExcepcion(333);
            }else{
                System.out.println("kkkkk");
            }
 
        } catch (MiExcepcion ex) {
            System.out.println(ex.getMessage());
        }
 
    }
 
}