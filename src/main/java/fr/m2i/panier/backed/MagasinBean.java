package fr.m2i.panier.backed;

//import fr.m2i.panier.cruds.ArticleCrud;
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
public class MagasinBean implements Serializable
{
	// rendre serializable pour sessionScope
	private static final long serialVersionUID = 1L;


	private String nom;

	private List<LigneDeCommande> stock;

	@PostConstruct
	public void init(){
		nom= "Magasin";

//		ArticleCrud articleCrud = new ArticleCrud();
//		stock = articleCrud.getArticles();
		stock = new ArrayList();
		stock.add(new LigneDeCommande(new Article("Pomme","Golden",0.99d),1));
		stock.add(new LigneDeCommande(new Article("kaki","kaki passion",0.49d),1));
		stock.add(new LigneDeCommande(new Article("banane","banane de madagascar",0.39d),1));
		stock.add(new LigneDeCommande(new Article("prune","reine claude",0.19d),1));
		stock.add(new LigneDeCommande(new Article("fraise","fraise origine espagne",0.29d),1));
		stock.add(new LigneDeCommande(new Article("kiwi","Kiwi jaune",0.29d),1));
	}

	public String getNom() {
		return nom.toUpperCase();
	}
	public void setNom(String nom) {
		this.nom = nom;
	}

	public List<LigneDeCommande> getStock() {
		return stock;
	}

	public void setStock(List<LigneDeCommande> stock) {
		this.stock = stock;
	}
}
