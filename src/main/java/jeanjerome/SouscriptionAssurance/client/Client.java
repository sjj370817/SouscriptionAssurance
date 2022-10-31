package jeanjerome.SouscriptionAssurance.client;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import jeanjerome.SouscriptionAssurance.conseiller.Conseiller;
import jeanjerome.SouscriptionAssurance.contrat.Contrat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="client")
public class Client {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	 private long id;
	 private String _nom;
	 private String _prenom;
	 private String _num;
	 private String _adresse;
	 
	 @ManyToOne
	 private Conseiller conseiller;
	 
	 @OneToMany
	 private ArrayList<Contrat> contrats;

}
