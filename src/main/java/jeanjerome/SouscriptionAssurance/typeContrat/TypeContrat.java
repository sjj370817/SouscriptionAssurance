package jeanjerome.SouscriptionAssurance.typeContrat;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import jeanjerome.SouscriptionAssurance.contrat.Contrat;
import jeanjerome.SouscriptionAssurance.option.Option;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table (name = "TypeContrat")
public class TypeContrat {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	protected Long Id;
	protected String titre;
	protected String nature;
	protected int delaisRetractation; 
	protected ArrayList<Contrat> contrats;
	protected ArrayList<Option> optionSups;

}
