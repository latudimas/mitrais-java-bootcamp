package com.mitrais.javabootcamp.repositories;

import com.mitrais.javabootcamp.models.Album;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AlbumRepository extends JpaRepository<Album, Long> {

    // Get All Albums the Artist had by Artist Id
    @Query(value = "SELECT t.* FROM java_bootcamp.album t WHERE artist_id = ?1", nativeQuery = true)
    List<Album> getAlbumByArtistId(long id);

    // Get All Albums the Artist had by Artist first name
    @Query(value = "SELECT t.* FROM java_bootcamp.album t JOIN java_bootcamp.artist u WHERE u.firstName = ?1", nativeQuery = true)
    List<Album> getAlbumByArtistName(String firstName);
}
