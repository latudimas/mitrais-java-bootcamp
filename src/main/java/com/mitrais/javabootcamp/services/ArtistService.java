package com.mitrais.javabootcamp.services;

import com.mitrais.javabootcamp.models.Artist;

import java.util.List;
import java.util.Optional;

public interface ArtistService {
    Artist createArtist(Artist artist);
    Optional<Artist> getArtist(Long id);
    Artist editArtist(Artist artist);
    void deleteArtistById(Long id);
    List<Artist> getAllArtist();
    long countArtist();
    List<Artist> getAllArtistOrderedByDateOfBirth(String keyword);
}
