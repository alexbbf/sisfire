package sisfire.view;

import java.util.List;

import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import sisfire.business.MilitarBusiness;
import sisfire.model.Militar;
import java.io.Serializable;

@Named("militar")
@SessionScoped
public class MilitarView {
	
	@EJB
	private MilitarBusiness business;
	
	public List<Militar> getMilitares(){
		return business.listar();
	}

}
