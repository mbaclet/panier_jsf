package fr.m2i.panier.backed;

import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Named
@SessionScoped
public class UserBean implements Serializable
{
	
	private static final long serialVersionUID = 1L;


	private String nom;
	private String prenom;
	private String password;
	private String username;
	private List<String> liste;

	@PostConstruct
	public void init(){
		nom= "argaud";
		prenom="olivier";
		password="";
		username="";
		liste = new ArrayList<String>(Arrays.asList("Rouge", "Vert", "Bleu"));
	}

	public String getNom() {
		return nom.toUpperCase();
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public List<String> getListe() {
		return liste;
	}
	public void setListe(List<String> liste) {
		this.liste = liste;
	}

	public Boolean isLog(){
		if(!this.username.equals("admin")){
			return false;
		}
		return true;
	}
}
