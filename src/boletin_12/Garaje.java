/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin_12;

import javax.swing.JOptionPane;

/**
 *
 * @author Samuel
 */
public class Garaje {
    private int numeroCoches;
    private String matricula;
    private long time_start, time_end;
    private double dinero;
    
    public void pagos(){
    if(time_end-time_start<3){
        dinero=1.5;
    }
    else{
        dinero=1.5+(time_end-time_start)*0.2;
    }
    }
    
    public void programa(){
    int eleccion;
    String dato;
    double pago;
     if(time_end-time_start<3){
        dinero=1.5;
    }
    else{
        dinero=1.5+(time_end-time_start)*0.2;
    }
   String[] opciones={"APARCAR","RETIRAR","SALIR"};
eleccion = JOptionPane.showOptionDialog(null,"QUE ACCIÓN DESEA HACER?" ,null,JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE,null,opciones,null);
numeroCoches++;
while(eleccion<=1){
    switch(eleccion){
   case 0:
       
    time_start = System.currentTimeMillis()/1000/60/60;
  dato = JOptionPane.showInputDialog(null, "Diganos su matricula");
  this.matricula=dato;
   eleccion = JOptionPane.showOptionDialog(null,"QUE ACCIÓN DESEA HACER?" ,null,JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE,null,opciones,null);
   numeroCoches++;
   break;

case 1:
    if(numeroCoches>1){
    time_end = System.currentTimeMillis()/1000/60/60;
    pago= Double.parseDouble(JOptionPane.showInputDialog(null, "Pague "+dinero));
    JOptionPane.showMessageDialog(null, "FACTURA\nMatricula del coche: "+matricula+"\nTiempo: "+( time_end - time_start )+" horas\nPrecio: "+dinero+"\nCartos recibidos: "+pago+"\nCartos devoltos: "+(pago-dinero));
    numeroCoches--;
   JOptionPane.showMessageDialog(null, "Gracias por usar nuestro aparcamiento");
   eleccion = JOptionPane.showOptionDialog(null,"QUE ACCIÓN DESEA HACER?" ,null,JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE,null,opciones,null);
    }
    else{
        JOptionPane.showMessageDialog(null, "No has realizado ningun aparcamiento para relizar el retiro\nGracias por su atencion");
         eleccion = JOptionPane.showOptionDialog(null,"QUE ACCIÓN DESEA HACER?" ,null,JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE,null,opciones,null);
    }
   break;
}
     
}
}
}

