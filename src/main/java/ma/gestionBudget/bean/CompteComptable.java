package ma.gestionBudget.bean;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class CompteComptable implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String libelle;
	private Integer code;
	private Double montant;
    private String refCompteComptable;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	public Double getMontant() {
		return montant;
	}
	public void setMontant(Double montant) {
		this.montant = montant;
	}
	public CompteComptable(Long id, String libelle, int code, double montant) {
		super();
		this.id = id;
		libelle = libelle;
		this.code = code;
		this.montant = montant;
	}
	
	
	public String getRefCompteComptable() {
		return refCompteComptable;
	}
	public void setRefCompteComptable(String refCompteComptable) {
		this.refCompteComptable = refCompteComptable;
	}
	public CompteComptable() {
		super();
	
	}
	
}
