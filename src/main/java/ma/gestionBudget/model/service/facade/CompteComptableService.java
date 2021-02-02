package ma.gestionBudget.model.service.facade;

import java.util.List;

import org.springframework.stereotype.Service;

import ma.gestionBudget.bean.CompteComptable;



@Service
public interface CompteComptableService {
	public List<CompteComptable> findAll();
	public int save(CompteComptable compteComptable);
	public int update(CompteComptable compteComptable);
	public void deleteById(Long id);
	public CompteComptable findByLibelle(String Libelle);
	public CompteComptable findByRefCompteComptable(String refCompteComptable);
	public CompteComptable findBycode(int code);

}
