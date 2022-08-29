package fr.m2i.panier.models;

public class LigneDeCommande {


    private Article article;
    private Integer quantity;


    public LigneDeCommande() {
    }

    public LigneDeCommande(Article article, Integer quantité) {
        this.article = article;
        this.quantity = quantité;
    }

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }


    public Double total(LigneDeCommande ligneDeCommande){
        return (double) Math.round(ligneDeCommande.getQuantity() * ligneDeCommande.getArticle().getPrix()*100)/100;
    }
}
