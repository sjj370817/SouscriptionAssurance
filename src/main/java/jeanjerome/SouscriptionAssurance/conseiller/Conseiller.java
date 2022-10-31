package jeanjerome.SouscriptionAssurance.conseiller;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import jeanjerome.SouscriptionAssurance.Rdv.Rdv;
import jeanjerome.SouscriptionAssurance.client.Client;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table (name ="conseiller")
public class Conseiller {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String fname;
	private String lname;
	private String num;
	private String mail; 
	private String disponibility;
	
	@OneToMany (mappedBy = "conseiller", fetch = FetchType.LAZY)
	@JsonProperty(access= Access.WRITE_ONLY)
	private ArrayList<Client> clients;
	
	@OneToMany (mappedBy = "conseiller", fetch = FetchType.LAZY)
	@JsonProperty(access= Access.WRITE_ONLY)
	private ArrayList<Rdv> rdvs;

}
