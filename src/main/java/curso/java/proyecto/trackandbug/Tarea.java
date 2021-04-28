package curso.java.proyecto.trackandbug;

import java.util.*;

import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


public class Tarea {
	
	@ManyToOne
	private TipoDeTarea tipodetarea;
	
	public TipoDeTarea getTipodetarea() {
		return tipodetarea;
	}

	public void setTipodetarea(TipoDeTarea tipodetarea) {
		this.tipodetarea = tipodetarea;
	}

	public List<Comentario> getComentarios() {
		return comentarios;
	}

	public void setComentarios(List<Comentario> comentarios) {
		this.comentarios = comentarios;
	}

	@OneToMany
	private List<Comentario> comentarios = new ArrayList<Comentario>();

}
