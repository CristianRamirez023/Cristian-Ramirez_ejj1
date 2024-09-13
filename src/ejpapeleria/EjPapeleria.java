/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejpapeleria;

import Igup.Pap;



/**
 *
 * @author crist
 */
public class EjPapeleria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Pap pap = new Pap();
        pap.setVisible(true);
        pap.setLocationRelativeTo(null);
        
        
        
        
    }
    
    public static double calcularPrecioVenta(double costo) {
        double ganancia;
        
        if (costo < 3000) {
            ganancia = 0.15;
        } else if (costo >= 3000 && costo <= 6000) {
            ganancia = 0.2;
        } else {
            ganancia = 0.25;
        }
        
        return costo + (costo * ganancia);
    }
}
