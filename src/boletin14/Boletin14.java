package boletin14;

public class Boletin14 {

    public static void main(String[] args) {
        Garaxe g1 = new Garaxe();
        try{
            g1.rexistroCoche((float)12.05);
        }catch(NullPointerException e1){
            System.out.println(e1.getMessage());
        }
        
        g1.mostrarFactura((float)15.10, 10);
        
        Garaxe g2 = new Garaxe();
        g2.rexistroCoche((float)12.05);
        
        
        Garaxe g3 = new Garaxe();
        g3.rexistroCoche((float)12.05);

        
        Garaxe g4 = new Garaxe();
        g4.rexistroCoche((float)12.05);

        
        Garaxe g5 = new Garaxe();
        g5.rexistroCoche((float)12.05);

        
        Garaxe g6 = new Garaxe();
        g6.rexistroCoche((float)12.05);

    }
    
}
