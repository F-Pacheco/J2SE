package com.educacionIT.digitalers.Clase01;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class App 
{
    public static void main( String[] args )
    {
      String[] names = null; //Para que no de error en el for
      try {
    	  int cantNames = Integer.parseInt(JOptionPane.showInputDialog("Cantidad"));
    	  names = new String[cantNames]; 
    	  for (int i = 0; i < names.length; i++) {
    			names[i]= JOptionPane.showInputDialog("Ingrese nombre numero "+(i+1));
    		}
    	      JOptionPane.showMessageDialog(null, Arrays.toString(names));
      }catch (Exception e) {
    	  System.out.println("Error");
      } finally {
    	  System.out.println("End...");
      }
    }
}
