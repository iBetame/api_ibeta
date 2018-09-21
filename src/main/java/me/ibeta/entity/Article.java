package me.ibeta.entity;

import javax.persistence.*;

@Entity
@Table(name = "ibeta_posts")
public class Article {

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private int id;

    @Column(name="post_url")
    private String url;

    @Column(name="post_author")
    private String author;

    @Column(name="post_title")
    private String title;

    @Column(name="post_summary")
    private String summary;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

}
