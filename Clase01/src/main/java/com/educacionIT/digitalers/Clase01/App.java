package com.educacionIT.digitalers.Clase01;

import javax.swing.JOptionPane;

import com.educacionIT.digitalers.Entidades.Persona;
import com.educacionIT.digitalers.Exceptions.ExceptionEducacionIT;

public class App 
{
    public static void main( String[] args )
    {
     /* String[] names = null; //Para que no de error en el for
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
      } */
    	
    	//Try with resource
    	//para poder usarlo, la clase debe implementar la interface
    	//autocloseable o closeable
    	/*Integer id = Integer.parseInt(JOptionPane.showInputDialog("id"));
    	String nombre = JOptionPane.showInputDialog("nombre");
    	
    	try(Persona perso = new Persona(id, nombre)){
    		System.out.println("Se pudo");
    	} catch (Exception e) {
			
		}*/
    	
    	Persona perso = new Persona();
    	try {
			//perso.setEdad((byte)-1);
			perso.setNombre("o");
		} catch (ExceptionEducacionIT e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    }
    	
}
