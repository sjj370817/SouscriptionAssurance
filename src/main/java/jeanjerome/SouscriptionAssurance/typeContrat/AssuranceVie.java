package jeanjerome.SouscriptionAssurance.typeContrat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table (name="assuranceVie")
public class AssuranceVie extends TypeContrat{
	@javax.persistence.Id
	@GeneratedValue (strategy =  GenerationType.IDENTITY)
	private String type;
	private String beneficiaire; 
	private Double epargne;
	private String taux; 
	
	
	

}
