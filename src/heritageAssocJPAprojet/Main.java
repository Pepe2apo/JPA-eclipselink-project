/**
 * 
 */
package heritageAssocJPAprojet;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

/**
 * @author akouam
 *
 */
public class Main {


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		EntityManager entityManager = Persistence.
				createEntityManagerFactory("heritageAssocJPAprojet").createEntityManager();

		Adresse ad =new Adresse();
		ad.setCodePostal("20567");
		ad.setStreetName("via Roma");
		ad.setStreetNumber(46);
		
		Cours cours = new Cours();
		cours.setLibelleUE("Donnee du web");
		cours.setCodeUE("Inf380");
		//cours.setProfesseur(prof);
		List<Cours> crs = new ArrayList<>();
		crs.add(cours);
		
		Etudiant etud = new Etudiant();
		etud.setNom("TOTI"); 
		etud.setPrenom("Francesco");
		etud.setAdresse(ad);
		
		Professeur prof = new Professeur();
		prof.setNom("Mutti");
		prof.setPrenom("Mario");
		prof.setAdresse(new Adresse("43126", 6, "via abbeveratoria"));
		prof.setListCour(crs);
		cours.setProfesseur(prof);
		
		entityManager.getTransaction().begin();
		//entityManager.persist(ad);
		//entityManager.persist(cours);
		entityManager.persist(etud);
		entityManager.persist(prof);
		entityManager.getTransaction().commit();
		
	
	}

}
