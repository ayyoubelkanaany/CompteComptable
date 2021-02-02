package ma.gestionBudget.model.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ma.gestionBudget.bean.CompteComptable;
import ma.gestionBudget.model.dao.CompteComptableRepository;
import ma.gestionBudget.model.service.facade.CompteComptableService;


@Service
public class CompteComptableServiceImpl implements CompteComptableService {
	@Autowired
	CompteComptableRepository compteComptableRep;
	
	public CompteComptable findBycode(int code) {
		if(compteComptableRep.findByCode(code) !=null) {
			return compteComptableRep.findByCode(code);
		}
		return null;
	}

	public CompteComptable findByLibelle(String Libelle) {
		if(compteComptableRep.findByLibelle(Libelle)!=null) {
			return compteComptableRep.findByLibelle(Libelle);
		}
		return null;
	}


	public List<CompteComptable> findAll() {
		return compteComptableRep.findAll();
	}

	public void delete(CompteComptable entity) {
		compteComptableRep.delete(entity);
	}

	@Transactional
	public void deleteById(Long id) {
		if(compteComptableRep.findById(id).isPresent()) {
			compteComptableRep.deleteById(id);
		}
		return;
	}

	public void deleteAll() {
		compteComptableRep.deleteAll();
	}

	@Override
	public int save(CompteComptable compteComptable) {
		CompteComptable loadedcompteComptable;
		if(compteComptable == null) {
			return -1;
		}
		
		if(this.compteComptableRep.findByRefCompteComptable(compteComptable.getRefCompteComptable()) != null) {
			return -2;
		}
		else {
			if(compteComptable.getId() == null) {
				this.compteComptableRep.save(compteComptable);
				}
				else {
					update(compteComptable);
				}
				return 1;
			
		}
		}

	@Override
	public int update(CompteComptable compteComptable) {
		if(compteComptable.getId() == null && compteComptable != null) {
			this.compteComptableRep.save(compteComptable);
			return 1;
		}
		else
		    return -1;
		}
		

	@Override
	public CompteComptable findByRefCompteComptable(String refCompteComptable) {
		if(refCompteComptable !=null) {
			return this.compteComptableRep.findByRefCompteComptable(refCompteComptable);
		}
		else {
			return null;
		}
		
	}

	



}
