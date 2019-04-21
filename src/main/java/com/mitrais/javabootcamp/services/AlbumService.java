package com.mitrais.javabootcamp.services;

import com.mitrais.javabootcamp.models.Album;

import java.util.List;
import java.util.Optional;

public interface AlbumService {
    Album createAlbum (Album album);
    Optional<Album> getAlbum(Long id);
    Album editAlbum(Album album);
    void deleteAlbum(Long id);
    List<Album> getAllAlbum();
    long countAlbum();
}
