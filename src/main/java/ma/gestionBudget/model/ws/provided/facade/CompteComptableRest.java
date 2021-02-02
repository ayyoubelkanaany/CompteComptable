package ma.gestionBudget.model.ws.provided.facade;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;
import ma.gestionBudget.bean.CompteComptable;
import ma.gestionBudget.model.service.facade.CompteComptableService;
import ma.gestionBudget.model.ws.provided.converter.CCConverter;
import ma.gestionBudget.model.ws.provided.vo.CompteComptableVo;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class CompteComptableRest {
	
	@Autowired
	CompteComptableService compteComptableService;

	@Autowired
	private CCConverter ccConverter;
	
	@ApiOperation("Cette methode permet de lister l'ensemble des comptecomptable par reference ")
	@RequestMapping(value = "/CompteComptable/refCompteComptable/{refCompteComptable}",method= RequestMethod.GET)
	public CompteComptableVo findByRefCompteComptable(@PathVariable String refCompteComptable) {
		return ccConverter.toVo(compteComptableService.findByRefCompteComptable(refCompteComptable));
	}

	
	@ApiOperation("Cette methode permet de lister l'ensemble des comptecomptable ")
	@RequestMapping(value = "/CompteComptable",method= RequestMethod.GET)	
     public List<CompteComptableVo> findAll() {
		return ccConverter.toListVo(compteComptableService.findAll());
	}
	
	@ApiOperation("Cette methode permet de sauvegarder un Comptecomptable ")
	@RequestMapping(value = "/CompteComptable",method= RequestMethod.POST)
	public int save(@RequestBody CompteComptableVo compteComptableVo) {
		return compteComptableService.save(ccConverter.toBean(compteComptableVo));
	}
	

	@ApiOperation("Cette methode permet de supprimer un comptecomptable par son id ")
	@RequestMapping(value = "/CompteComptable/id/{id}",method= RequestMethod.DELETE)
	public void deleteById(@PathVariable Long id) {
		compteComptableService.deleteById(id);
	}
	@ApiOperation("Cette methode permet de trouver un CompteComptable à partir de son libelle ")
	@RequestMapping(value = "/CompteComptable/Libelle/{libelle}",method= RequestMethod.GET)
	public CompteComptableVo findByLibelle(@PathVariable String libelle) {
		return ccConverter.toVo(compteComptableService.findByLibelle(libelle));
	}


	@ApiOperation("Cette methode permet de trouver un comptecomptable par son code ")
	@RequestMapping(value = "/CompteComptable/code/{code}",method= RequestMethod.GET)
	public CompteComptableVo findBycode(@PathVariable int code) {
		return ccConverter.toVo(compteComptableService.findBycode(code));
	}
}
