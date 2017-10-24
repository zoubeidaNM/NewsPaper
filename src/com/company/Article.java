package com.company;

public class Article {
    private String title;
    private String date;

    public Article(String title, String date) {
        this.title = title;
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String toString(){
        // writes Article data to a string
        String str="";
        str = str.format("%-20s%-8s\n", title, date);
        return str;
    }
}
