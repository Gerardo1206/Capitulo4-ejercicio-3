package ejercicio3;

public class Ejercicio3 {
    public static void main(String[] args) {
        Integer a=10;
        Integer b=360;
        String c="canario";
        BirdSighting ave = new BirdSighting();
        BirdSighting ave1 = new BirdSighting(a,b,c);
        System.out.println(ave.toString())      ;
        System.out.println(ave1.toString());
        
    }
    
}
