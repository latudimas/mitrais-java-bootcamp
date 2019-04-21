package com.mitrais.javabootcamp.models;

import javax.persistence.*;

@Entity
@Table(name = "album")
public class Album {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    private long id;

    @Column(name = "album_name", nullable = false)
    private String albumName;

    @Column(name = "release_year")
    private int releaseYear;

    @Column(name = "total_song")
    private int totalSong;

    @Column(name = "total_duration")
    private int totalDuration;

    // Relation OneToMany Setup with Artist Class
    @ManyToOne
    @JoinColumn(name = "artist_id")
    private Artist artist;

    // Constructor
    public Album() {
    }

    // Constructor
    public Album(String albumName, int releaseYear, int totalSong, int totalDuration, Artist artist) {
        this.albumName = albumName;
        this.releaseYear = releaseYear;
        this.totalSong = totalSong;
        this.totalDuration = totalDuration;
        this.artist = artist;
    }

    /* Getter and Setter methods */

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public int getTotalSong() {
        return totalSong;
    }

    public void setTotalSong(int totalSong) {
        this.totalSong = totalSong;
    }

    public int getTotalDuration() {
        return totalDuration;
    }

    public void setTotalDuration(int totalDuration) {
        this.totalDuration = totalDuration;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }
}
