package com.company;

import java.util.ArrayList;

public class NewsPaper {

    private String brand;
    private ArrayList<Article> articles;

    public NewsPaper() {
        brand ="";
        articles = new ArrayList<Article>();
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public ArrayList<Article> getArticles() {
        return articles;
    }

    public void setArticles(ArrayList<Article> articles) {
        this.articles = articles;
    }

    public void addArticle(Article article){
        articles.add(article);
    }

    public String toString(){
        // writes Newspaper data to a String
        String str="";
        str +="===================================\n";
        str += brand.toUpperCase()+"\n";
        str += "Articles:\n";
        str+="===================================\n";
        for (Article article:articles){
            str += article;
        }
       str+="===================================\n";
        return str;
    }
}
