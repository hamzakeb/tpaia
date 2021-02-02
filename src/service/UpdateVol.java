package service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import models.Vol;

public class UpdateVol {
   public static void main( String[ ] args ) {
      EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "aia" );
      
      EntityManager entitymanager = emfactory.createEntityManager( );
      entitymanager.getTransaction( ).begin( );
      Vol vol = entitymanager.find( Vol.class, "3" );
      
      //before update
      System.out.println( vol );
      vol.setVilleArrivee( "new york" );
      entitymanager.getTransaction( ).commit( );
      
      //after update
      System.out.println( vol );
      entitymanager.close();
      emfactory.close();
   }
}