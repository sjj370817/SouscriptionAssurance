package jeanjerome.SouscriptionAssurance.typeContrat;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table (name ="assuranceVoiture")
public class AssuranceVoiture extends TypeContrat{
	
	@javax.persistence.Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Temporal(TemporalType.DATE)
	private Date _datePermis; 
	private String _marque; 
	private int _immatriculation; 
	private String _formule;
}
