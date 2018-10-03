package me.ibeta.entity;

import javax.persistence.*;

/**
 * Created by sunbelife on 2018/9/28.
 */

@Entity
@Table(name = "ibeta_pt")
public class PT {

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private int id;

    @Column(name="app_id")
    private String app_id;

    @Column(name="artwork")
    private String artwork;

    @Column(name="name")
    private String name;

    @Column(name="pricefrom")
    private float pricefrom;
    
    @Column(name="priceto")
    private float priceTo;

    @Column(name="platform")
    private String platform;

    @Column(name="genre")
    private String genre;

    @Column(name="rating")
    private String rating;
    
    @Column(name="modified")
    private String modified;

    public String getApp_id() {
        return app_id;
    }

    public void setApp_id(String app_id) {
        this.app_id = app_id;
    }

    public String getArtwork() {
        return artwork;
    }

    public void setArtwork(String artwork) {
        this.artwork = artwork;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPricefrom() {
        return pricefrom;
    }

    public void setPricefrom(float pricefrom) {
        this.pricefrom = pricefrom;
    }

    public float getPriceTo() {
        return priceTo;
    }

    public void setPriceTo(float priceTo) {
        this.priceTo = priceTo;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getModified() {
        return modified;
    }

    public void setModified(String modified) {
        this.modified = modified;
    }
}
