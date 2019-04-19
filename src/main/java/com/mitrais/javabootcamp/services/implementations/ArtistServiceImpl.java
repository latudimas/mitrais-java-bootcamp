package com.mitrais.javabootcamp.services.implementations;

import com.mitrais.javabootcamp.models.Artist;
import com.mitrais.javabootcamp.repositories.ArtistRepository;
import com.mitrais.javabootcamp.services.ArtistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ArtistServiceImpl implements ArtistService {

    @Autowired
    private ArtistRepository artistRepository;

    /**
     * Methods for add new entry of artist to database
     * @param artist
     * @return data entry of artist that have been created
     */
    @Override
    public Artist createArtist(Artist artist) {
        return artistRepository.save(artist);
    }

    /**
     * Methods for show an artist by its Id
     * @param id artist id in database
     * @return information about artist
     */
    @Override
    public Optional<Artist> getArtist(Long id) {
        return artistRepository.findById(id);
    }

    /**
     * Edit data entry of one artist
     * @param artist new data entry
     * @return new data entry of an artist
     */
    @Override
    public Artist editArtist(Artist artist) {
        return artistRepository.save(artist);
    }

    /**
     * Delete an artist data by its id
     * @param id
     */
    @Override
    public void deleteArtistById(Long id) {
        artistRepository.deleteById(id);
    }

    /**
     * List all artist in the database
     * @return list of all artist
     */
    @Override
    public List<Artist> getAllArtist() {
        return artistRepository.findAll();
    }

    /**
     * Count the numbers of artist listed in the database
     * @return
     */
    @Override
    public long countArtist() {
        return artistRepository.count();
    }
}
