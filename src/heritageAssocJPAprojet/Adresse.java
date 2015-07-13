package heritageAssocJPAprojet;


import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Adresse
 *
 */
@Entity
@Table(name="tbl_adresse")
public class Adresse implements Serializable {
    
	@Id
	@Column(name="fldAdr_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column(name="fld_codePostal")
	private String codePostal;
	
	@Column(name="fld_streetNumber")
	private Integer streetNumber;
	
	@Column(name="fld_streetName")
	private String streetName;
	
	private static final long serialVersionUID = 1L;

	public Adresse() {
		super();
	}  
	
	
	/**
	 * @param codePostal
	 * @param streetNumber
	 * @param streetName
	 */
	public Adresse(String codePostal, Integer streetNumber, String streetName) {
		super();
		this.codePostal = codePostal;
		this.streetNumber = streetNumber;
		this.streetName = streetName;
	}


	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}   
	public String getCodePostal() {
		return this.codePostal;
	}

	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}   
	public Integer getStreetNumber() {
		return this.streetNumber;
	}

	public void setStreetNumber(Integer streetNumber) {
		this.streetNumber = streetNumber;
	}   
	public String getStreetName() {
		return this.streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
   
}
