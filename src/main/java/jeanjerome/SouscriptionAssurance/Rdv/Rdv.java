package jeanjerome.SouscriptionAssurance.Rdv;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import jeanjerome.SouscriptionAssurance.conseiller.Conseiller;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Rdv {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String raisonPrincipal; 
	@Temporal(TemporalType.DATE)
	private Date date ;
	
	@ManyToOne
	private Conseiller conseiller; 

}
