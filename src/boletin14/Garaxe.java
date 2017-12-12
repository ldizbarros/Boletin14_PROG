package boletin14;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Garaxe {
    private final int CAPACIDADE = 5;
    private static int numeroCoches = 0;
    private String matricula;
    private float horaEntrada;

    public int getNumeroCoches() {
        return numeroCoches;
    }
    
    public void rexistroCoche(float hora) throws NullPointerException{
        if (numeroCoches==CAPACIDADE){
            System.out.println("COMPLETO");
        }
        else{
            System.out.println("PLAZAS DISPOÑIBLES");
            matricula = JOptionPane.showInputDialog("Introduzca la matricula del coche");
            if (matricula == null){
                throw new NullPointerException("Matricula Incorrecta, no puede entrar");
            }else if (matricula.equals("")){
                System.out.println("Matricula Incorrecta, no puede entrar");
            }else{
                horaEntrada=hora;
                numeroCoches++;
            }
        }
    }
    
    public void mostrarFactura(float hora,float cartos){
        DecimalFormat df = new DecimalFormat("0.00"); 
        float tempo =Math.abs(horaEntrada-hora);
        float precio;
        if (tempo<3){
            precio=(float)(tempo*1.5/3);
        }
        else if(tempo==3){
            precio=(float)1.5;
        }else{
            precio=(float)(1.5+((tempo-3)*0.20));
        }
        
        System.out.println("******* FACTURA ********\n" +
                "MATRICULA COCHE ........ " +matricula+"  \n"+
                "TEMPO ................. " +df.format(tempo)+" horas  \n"+
                "PRECIO............... " +df.format(precio)+"  € \n"+
                "CARTOS RECIBIDOS........... " +cartos+" €  \n"+
                "CARTOS DEVOLTOS............ " +df.format(cartos-precio)+" € \n"+
                "\n" +
                "GRACIAS POR USAR O NOSO APARCADOIRO ");
    }
    
}
