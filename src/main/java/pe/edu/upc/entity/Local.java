package pe.edu.upc.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Local implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	private int idLocal;
	
	private String nombreLocal;
}
