package curso.java.proyecto.trackandbug;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class TipoDeTarea {
	
	@Id
	@GeneratedValue
	private Long id;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	private String nombre;

}
