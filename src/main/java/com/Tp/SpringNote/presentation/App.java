package com.Tp.SpringNote.presentation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Tp.SpringNote.metier.Etudiant;
import com.Tp.SpringNote.metier.Formation;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	/** ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
         Formation f = context.getBean("formation", Formation.class);
         f.setIdFormation(2);
         f.setNomFormation("Français");**/
    	 ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
         Etudiant e = context.getBean("etudiant", Etudiant.class);
         e.setId(2);
         e.setNom("Français");
         e.setPrenom("remi");
        
         
         System.out.println(e);
        
         
         
         
         
         
         
         
        context.close();
    }
}
