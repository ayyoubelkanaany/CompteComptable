package ma.gestionBudget.model.dao;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import ma.gestionBudget.bean.CompteComptable;



@Repository
public interface CompteComptableRepository extends JpaRepository<CompteComptable, Long> {


	 public CompteComptable findByCode(int code);
	 public CompteComptable findByLibelle(String Libelle);
     public CompteComptable findByRefCompteComptable(String refCompteComptable);
	 
	 @Query("SELECT montant FROM CompteComptable m WHERE m.libelle = :libelle")
	 public double recupererMontant(@Param("libelle") String libelle);
	 

	 
}
