package fr.m2i.panier.models;


import java.io.Serializable;



public class Article implements Serializable
{
	
	private static final long serialVersionUID = 1L;


	private String nom;
	private String description;
	private Double prix;

	public Article() {
	}

	public Article(String nom, Double prix) {
		this.nom = nom;
		this.prix = prix;
	}


	public Article(String nom, String description, Double prix) {
		this.nom = nom;
		this.description = description;
		this.prix = prix;
	}

	public String getNom() {
		return nom.toUpperCase();
	}
	public void setNom(String nom) {
		this.nom = nom;
	}

	public Double getPrix() {
		return prix;
	}

	public void setPrix(Double prix) {
		this.prix = prix;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}




}
