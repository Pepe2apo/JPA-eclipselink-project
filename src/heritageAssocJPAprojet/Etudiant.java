package heritageAssocJPAprojet;


import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Etudiant
 *
 */
@Entity
@DiscriminatorValue("etudiant")
public class Etudiant extends Personne implements Serializable {

	
	private static final long serialVersionUID = 1L;

	public Etudiant() {
		super();
	}
   
}
