package sisfire.dao;

import java.util.List;

import javax.persistence.EntityManager;

import sisfire.model.Militar;

public class MilitarDao {
	
	private EntityManager em;
	
	public MilitarDao(EntityManager em) {
		this.em = em;
	}
	
	public List<Militar> listar(){
		return em.createQuery("SELECT m FROM Militar m ORDER BY m.nomeGuera ASC",Militar.class).getResultList();
	}
	

}
