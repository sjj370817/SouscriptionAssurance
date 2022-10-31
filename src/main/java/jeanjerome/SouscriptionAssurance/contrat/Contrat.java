package jeanjerome.SouscriptionAssurance.contrat;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import jeanjerome.SouscriptionAssurance.client.Client;
import jeanjerome.SouscriptionAssurance.typeContrat.TypeContrat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table (name ="contrat")
public class Contrat {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id; 
	
	@Temporal(TemporalType.DATE)
	private Date dateSubcrible;
	@Temporal(TemporalType.DATE)
	private Date enSubcrible;
	
	private String nameSubcrible;
	private Double montant; 

	@ManyToOne
	private Client client;
	
	@ManyToOne
	private TypeContrat typeContrat;
	

}
