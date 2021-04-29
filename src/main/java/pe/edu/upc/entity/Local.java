package pe.edu.upc.entity;

import java.io.Serializable;

import javax.persistence.Entity;

@Entity
public class Local implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	private int idLocal;
}
