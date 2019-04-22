package com.mitrais.javabootcamp.services.implementations;

import com.mitrais.javabootcamp.models.Album;
import com.mitrais.javabootcamp.repositories.AlbumRepository;
import com.mitrais.javabootcamp.services.AlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class AlbumServiceImpl implements AlbumService {

    @Autowired
    private AlbumRepository albumRepository;

    @Override
    public Album createAlbum(Album album) {
        return albumRepository.save(album);
    }

    @Override
    public Optional<Album> getAlbum(Long id) {
        return albumRepository.findById(id);
    }

    @Override
    public Album editAlbum(Album album) {
        return albumRepository.save(album);
    }

    @Override
    public void deleteAlbum(Long id) {
        albumRepository.deleteById(id);
    }

    @Override
    public List<Album> getAllAlbum() {
        return albumRepository.findAll();
    }

    @Override
    public long countAlbum() {
        return albumRepository.count();
    }

    @Override
    public List<Album> getAlbumByArtistId(long id) {
        return albumRepository.getAlbumByArtistId(id);
    }

    @Override
    public List<Album> getAlbumByArtistName(String firstName) {
        return albumRepository.getAlbumByArtistName(firstName);
    }

    @Override
    public List<Album> getAlbumUsingStream(long id) {
        return albumRepository.findAll().stream()
                .filter(album -> album.getArtist().getId() == id)
                .collect(Collectors.toList());
    }
}
