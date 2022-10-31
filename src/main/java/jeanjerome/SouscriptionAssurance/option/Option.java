package jeanjerome.SouscriptionAssurance.option;

import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import jeanjerome.SouscriptionAssurance.typeContrat.TypeContrat;


public class Option {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String name;
	
	private String description;
	
	@ManyToOne
	private TypeContrat typeContrat;

}
