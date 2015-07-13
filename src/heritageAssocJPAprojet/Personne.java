package heritageAssocJPAprojet;


import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import java.util.Date;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Personne
 *
 */
@Entity
//@Table(name="tbl_personne")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="TYPE_ENTITE")
public class Personne implements Serializable {

	@Id
	@Column(name = "fldPers_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column(name = "fld_nom")
	private String nom;
	
	@Column(name = "fld_prenom")
	private String prenom;
	
	
	@OneToOne (cascade=CascadeType.ALL)
	@JoinColumn(name="adresseID", unique= true, nullable=true, insertable=true, updatable=true)
	private Adresse adresse;
	
	/*@Column(name = "fld_dateNaissance")
	private Date dateNaissance;*/
	private static final long serialVersionUID = 1L;

	public Personne() {
		super();
	}   
	
	
	
	/**
	 * @param nom
	 * @param prenom
	 * @param adresse
	 */
	public Personne(String nom, String prenom, Adresse adresse) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
	}



	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}   
	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}   
	public String getPrenom() {
		return this.prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}   
	public Adresse getAdresse() {
		return this.adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}   
	/*public Date getDateNaissance() {
		return this.dateNaissance;
	}

	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}*/
   
}
