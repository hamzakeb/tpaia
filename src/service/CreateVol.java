package service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import models.Vol;

public class CreateVol {
	public static void main(String[] args) {

		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("aia");

		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();

		Vol vol = new Vol();
		vol.setNumVol("3");
		vol.setVilleDepart("paris");
		vol.setVilleArrivee("londre");
		vol.setHeureDepart(1230);

		entitymanager.persist(vol);
		entitymanager.getTransaction().commit();

		entitymanager.close();
		emfactory.close();
	}
}
