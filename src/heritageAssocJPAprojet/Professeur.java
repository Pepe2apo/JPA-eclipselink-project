package heritageAssocJPAprojet;


import java.io.Serializable;
import java.lang.Integer;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Professeur
 *
 */
@Entity
@DiscriminatorValue("professeur")
public class Professeur extends Personne implements Serializable {


	@JoinColumn(name="fldCours_id", unique= true, nullable=true, insertable=true, updatable=true)
	@OneToMany(mappedBy = "professeur", cascade = CascadeType.ALL)
	private List<Cours> listCours;
	
	private static final long serialVersionUID = 1L;

	public Professeur() {
		super();
	}   
  
	public List<Cours> getListCour() {
		return this.listCours;
	}

	public void setListCour(List<Cours> listCours) {
		this.listCours = listCours;
	}
   
}
