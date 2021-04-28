package curso.java.proyecto.trackandbug;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

public class Comentario {
	
	@Id
	@GeneratedValue
	private Long id;
	
	
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public Usuario getCreadoPor() {
		return creadoPor;
	}


	public void setCreadoPor(Usuario creadoPor) {
		this.creadoPor = creadoPor;
	}


	@ManyToOne
	private Usuario creadoPor;

}
