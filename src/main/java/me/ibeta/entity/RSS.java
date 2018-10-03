package me.ibeta.entity;

import javax.persistence.*;

@Entity
@Table(name = "ibeta_rss")
public class RSS {

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private int id;

    @Column(name="ios_version")
    private String iOS_version;

    @Column(name="ios_buildid")
    private String iOS_buildid;

    @Column(name="ios_pubtime")
    private String iOS_pubtime;

    @Column(name="watchos_version")
    private String watchOS_version;

    @Column(name="watchos_buildid")
    private String watchOS_buildid;

    @Column(name="watchos_pubtime")
    private String watchOS_pubtime;

    @Column(name="tvos_version")
    private String tvOS_version;

    @Column(name="tvos_buildid")
    private String tvOS_buildid;

    @Column(name="tvos_pubtime")
    private String tvOS_pubtime;

    @Column(name="macos_version")
    private String macOS_version;

    @Column(name="macos_buildid")
    private String macOS_buildid;

    @Column(name="macos_pubtime")
    private String macOS_pubtime;

    public String getiOS_version() {
        return iOS_version;
    }

    public void setiOS_version(String iOS_version) {
        this.iOS_version = iOS_version;
    }

    public String getiOS_buildid() {
        return iOS_buildid;
    }

    public void setiOS_buildid(String iOS_buildid) {
        this.iOS_buildid = iOS_buildid;
    }

    public String getiOS_pubtime() {
        return iOS_pubtime;
    }

    public void setiOS_pubtime(String iOS_pubtime) {
        this.iOS_pubtime = iOS_pubtime;
    }

    public String getWatchOS_version() {
        return watchOS_version;
    }

    public void setWatchOS_version(String watchOS_version) {
        this.watchOS_version = watchOS_version;
    }

    public String getWatchOS_buildid() {
        return watchOS_buildid;
    }

    public void setWatchOS_buildid(String watchOS_buildid) {
        this.watchOS_buildid = watchOS_buildid;
    }

    public String getWatchOS_pubtime() {
        return watchOS_pubtime;
    }

    public void setWatchOS_pubtime(String watchOS_pubtime) {
        this.watchOS_pubtime = watchOS_pubtime;
    }

    public String getTvOS_version() {
        return tvOS_version;
    }

    public void setTvOS_version(String tvOS_version) {
        this.tvOS_version = tvOS_version;
    }

    public String getTvOS_buildid() {
        return tvOS_buildid;
    }

    public void setTvOS_buildid(String tvOS_buildid) {
        this.tvOS_buildid = tvOS_buildid;
    }

    public String getTvOS_pubtime() {
        return tvOS_pubtime;
    }

    public void setTvOS_pubtime(String tvOS_pubtime) {
        this.tvOS_pubtime = tvOS_pubtime;
    }

    public String getMacOS_version() {
        return macOS_version;
    }

    public void setMacOS_version(String macOS_version) {
        this.macOS_version = macOS_version;
    }

    public String getMacOS_buildid() {
        return macOS_buildid;
    }

    public void setMacOS_buildid(String macOS_buildid) {
        this.macOS_buildid = macOS_buildid;
    }

    public String getMacOS_pubtime() {
        return macOS_pubtime;
    }

    public void setMacOS_pubtime(String macOS_pubtime) {
        this.macOS_pubtime = macOS_pubtime;
    }
}
