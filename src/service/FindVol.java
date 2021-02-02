package service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import models.Vol;

public class FindVol {
   public static void main( String[ ] args ) {
   
      EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "aia" );
      EntityManager entitymanager = emfactory.createEntityManager();
      Vol vol = entitymanager.find( Vol.class, "3" );

      System.out.println("employee ID = " + vol.getNumVol( ));
      System.out.println("employee NAME = " + vol.getVilleDepart( ));
      System.out.println("employee SALARY = " + vol.getVilleArrivee( ));
      System.out.println("employee DESIGNATION = " + vol.getHeureDepart( ));
   }
}