package ma.gestionBudget.model.ws.provided.vo;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

public class CompteComptableVo implements Serializable{
	
	private Long id;
	private String libelle;
	private String code;
	private String montant;
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
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getMontant() {
		return montant;
	}
	
	public String getRefCompteComptable() {
		return refCompteComptable;
	}
	public void setRefCompteComptable(String refCompteComptable) {
		this.refCompteComptable = refCompteComptable;
	}
	public void setMontant(String montant) {
		this.montant = montant;
	}

	
	
	
}
