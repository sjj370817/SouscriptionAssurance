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
@Table (name ="assuranceHabitation")
public class AssuranceHabitation extends TypeContrat {
	@javax.persistence.Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String _statut;
	private Double _surface; 
	

}
