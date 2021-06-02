package sisfire.business;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import sisfire.dao.MilitarDao;
import sisfire.model.Militar;

@LocalBean
@Stateless
public class MilitarBusiness {
	
	@PersistenceContext
	private EntityManager em;
	
	private MilitarDao dao;
	
	@PostConstruct
	private void init() {
		dao = new MilitarDao(em);
	}
	
	public List<Militar> listar(){
		return dao.listar();
	}
}
