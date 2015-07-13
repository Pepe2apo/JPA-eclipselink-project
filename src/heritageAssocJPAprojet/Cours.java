package heritageAssocJPAprojet;


import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Cour
 *
 */
@Entity
@Table(name = "tbl_cours")
public class Cours implements Serializable {

	@Id
	@Column(name="fldCours_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column(name="fld_codeUE")
	private String codeUE;
	
	@Column(name="fld_libelleUE")
	private String libelleUE;
	
	@ManyToOne
	@JoinColumn(name="fldProf_id")
	private Professeur professeur;
	
	private static final long serialVersionUID = 1L;

	public Cours() {
		super();
	}   
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}   
	public String getCodeUE() {
		return this.codeUE;
	}

	public void setCodeUE(String codeUE) {
		this.codeUE = codeUE;
	}   
	public String getLibelleUE() {
		return this.libelleUE;
	}

	public void setLibelleUE(String libelleUE) {
		this.libelleUE = libelleUE;
	}
	/**
	 * @return the professeur
	 */
	public Professeur getProfesseur() {
		return professeur;
	}
	/**
	 * @param professeur the professeur to set
	 */
	public void setProfesseur(Professeur professeur) {
		this.professeur = professeur;
	}
	
	
   
}
