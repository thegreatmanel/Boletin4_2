;
package boletin4_2;

import javax.swing.JOptionPane;


public class Boletin4_2 {

    
    public static void main(String[] args) {
        int preciouni=Integer.parseInt(JOptionPane.showInputDialog("introduce el precio de cada unidad"));
        int unidades=Integer.parseInt(JOptionPane.showInputDialog("Cuantos vas a comprar?"));
        
        if(unidades<100){
            JOptionPane.showMessageDialog(null,"unidades:"+unidades+" precio final="+(preciouni*unidades)+" sin descuento");}
        else if(unidades<200){
              if (preciouni>4000){JOptionPane.showMessageDialog(null,"unidades:"+unidades+" precio final="+(preciouni*unidades-(preciouni*unidades*0.05))+ "con un descuento en euros de"+(preciouni*unidades*0.05)); 
                }
              else {JOptionPane.showMessageDialog(null,"unidades:"+unidades+" precio final="+(preciouni*unidades-(preciouni+unidades*0.02))+ "con un descuento en euros de"+(preciouni*unidades*0.02));
        }
        }
              else if (unidades>=200){
              if (preciouni>4000){JOptionPane.showMessageDialog(null,"unidades:"+unidades+" precio final="+(preciouni*unidades-(preciouni*unidades*0.1))+ "con un descuento en euros de"+(preciouni*unidades*0.1)); 
                }
              else {JOptionPane.showMessageDialog(null,"unidades:"+unidades+" precio final="+(preciouni*unidades-(preciouni+unidades*0.08))+ "con un descuento en euros de"+(preciouni*unidades*0.08));
        }
    }}}
    

