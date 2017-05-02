/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lcdrefactor.logic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import lcdrefactor.view.LCDDisplay;
//import javax.swing.JOptionPane;

/**
 *
 * @author Jonathan
 */
public class LCDRefactor {
    static final String CADENA_FINAL = "0,0";
    static final int OPTION = 1;
    static List<String> listaCadenas = new ArrayList<>();
    static int espacioDig;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Establece los segmentos de cada numero
        LCDDisplay lcdview = new LCDDisplay();
        lcdview.setVisible(true);
    }
    
    public static String runNumericValidation(String cadena){
        try {
            // Valida si es un numero
            if (LCDPrinter.isNumeric(cadena)) {
                // se valida que el espaciado este entre 0 y 5
                if (LCDPrinter.rangeOk(OPTION, cadena)) {
                    espacioDig = Integer.parseInt(cadena);
                } else {
                    throw new IllegalArgumentException("El espacio entre "
                            + "digitos debe estar entre 0 y 5");
                }
            } else {
                throw new IllegalArgumentException("El espacio entre dígitos " + cadena
                        + " no es un entero");
            }
        } catch (Exception ex) {
            return "Error: " + ex.getMessage();
        }
        return "OK";
    }
    
    public static void addNumber(String cadena) {
        listaCadenas.add(cadena);
    }
    
    public static String runProcess(){
        try {
            LCDPrinter impresorLCD = new LCDPrinter();

            Iterator<String> iterator = listaCadenas.iterator();
            while (iterator.hasNext()) {
                try {
                    impresorLCD.procesar(iterator.next(), espacioDig);
                } catch (Exception ex) {
                    System.out.println("Error al procesar: " + ex.getMessage());
                }
            }
        } catch (Exception ex) {
            return "Error: " + ex.getMessage();
        }
       return "OK";
    }
    
    public static void clearData(){
        listaCadenas.clear();
    }
}
