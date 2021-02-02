package ma.gestionBudget.model.ws.provided.converter;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import org.springframework.stereotype.Component;

import ma.gestionBudget.bean.CompteComptable;
import ma.gestionBudget.model.ws.provided.vo.CompteComptableVo;

@Component
public class CCConverter {
	
	public CompteComptable toBean(CompteComptableVo vo) {
		if(vo==null) {
		return null;
		}
		else {
			CompteComptable compteComptable = new CompteComptable();
			if(vo.getLibelle() != null) {
				compteComptable.setLibelle(vo.getLibelle());
			}
		
			if(vo.getMontant() != null) {
				compteComptable.setMontant(Double.parseDouble(vo.getMontant()));
			}
			
			
			if(vo.getId()!=null) {
				compteComptable.setId(vo.getId());
			}
			if(vo.getRefCompteComptable()!=null) {
				compteComptable.setRefCompteComptable(vo.getRefCompteComptable());
			}
			if(vo.getCode()!=null) {
				compteComptable.setCode(Integer.parseInt(vo.getCode()));
			}
			return compteComptable;
		}
	}
	
	
	public CompteComptableVo toVo(CompteComptable compteComptable) {
		if(compteComptable==null) {
		return null;
		}
		else {
			CompteComptableVo vo = new CompteComptableVo();
			if(compteComptable.getRefCompteComptable() != null) {
				vo.setRefCompteComptable(compteComptable.getRefCompteComptable());
			}
			
			if(compteComptable.getLibelle() != null) {
				vo.setLibelle(compteComptable.getLibelle());
			}
			if(compteComptable.getMontant() != null) {
				vo.setMontant(compteComptable.getMontant().toString());
			}
			
			
			if(compteComptable.getId()!=null) {
				vo.setId(compteComptable.getId());
			}
			if(compteComptable.getCode()!=null) {
				vo.setCode(compteComptable.getCode().toString());
			}
			return vo;
		}
	}
	
	
	////////les list 
	public List<CompteComptable> toListBean(List<CompteComptableVo> vos) {
		if(vos==null || vos.isEmpty()) {
		return null;
		}
		
		else {
			
			List<CompteComptable> compteComptables = new ArrayList<CompteComptable>();
		   for(int i=0;i<vos.size();i++) {
			   compteComptables.add(toBean(vos.get(i)));
		   }
			
			return compteComptables;
		}
	}
	
	
	public List<CompteComptableVo> toListVo(List<CompteComptable>  compteComptables) {
		if(compteComptables==null || compteComptables.isEmpty()) {
		return null;
		}
		else {
			
			List<CompteComptableVo> vos = new ArrayList<CompteComptableVo>();
			for(int j=0;j<compteComptables.size();j++) {
				vos.add(toVo(compteComptables.get(j)));
			}
			return vos;
		}
	}
}
