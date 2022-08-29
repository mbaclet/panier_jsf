package fr.m2i.panier.backed;

import fr.m2i.panier.models.Article;
import fr.m2i.panier.models.LigneDeCommande;
import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


@Named
@SessionScoped
//doit implements Serializable pour utiliser SessionsScoped et stocker en session
public class PanierBean implements Serializable
{
	// rendre serializable pour sessionScope
	private static final long serialVersionUID = 1L;


	private String nom;
	private Integer quantity = 1;
	private List<LigneDeCommande> liste;

	@PostConstruct
	public void init(){
		nom= "Mon panier";
		liste = new ArrayList();
	}

	public String getNom() {
		return nom.toUpperCase();
	}
	public void setNom(String nom) {
		this.nom = nom;
	}

	public List<LigneDeCommande> getListe() {
		return liste;
	}

	public void setListe(List<LigneDeCommande> liste) {
		this.liste = liste;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public void addLigne(LigneDeCommande ligneMag){
		boolean test = false;
		for (LigneDeCommande ligneDeCommande:liste) {
			if(ligneDeCommande.getArticle().getNom().equals(ligneMag.getArticle().getNom())){
				ligneDeCommande.setQuantity(ligneMag.getQuantity()+ligneDeCommande.getQuantity());
				test = true;
				break;
			}
		}
		if(!test){
			liste.add(new LigneDeCommande(ligneMag.getArticle(), ligneMag.getQuantity()));
		}

	}

	public void removeLigneDeCommande(LigneDeCommande ligneDeCommande){
		liste.remove(ligneDeCommande);
	}

	public void minusLigneDeCommande(LigneDeCommande ligneDeCommande){
		ligneDeCommande.setQuantity(ligneDeCommande.getQuantity()-1);
		if(ligneDeCommande.getQuantity()<1){
			liste.remove(ligneDeCommande);
		}
	}

	public void plusLigneDeCommande(LigneDeCommande ligneDeCommande){
		ligneDeCommande.setQuantity(ligneDeCommande.getQuantity()+1);
	}

	public void emptyCart(){
		this.liste = new ArrayList<>();
	}

	public Double prixTotal(){
		Double total =0d;
		for (LigneDeCommande ligneDeCommande:liste) {
			total += ligneDeCommande.getArticle().getPrix()* ligneDeCommande.getQuantity();
		}
		return (double) Math.round(total*100)/100;
	}


}
