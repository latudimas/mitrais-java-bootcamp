package com.mitrais.javabootcamp.repositories;

import com.mitrais.javabootcamp.models.Artist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArtistRepository extends JpaRepository<Artist, Long> {
    // List all Artist Based on their date of birth (Descending order)
    @Query(value = "SELECT * FROM java_bootcamp.artist t ORDER BY date_of_birth DESC", nativeQuery = true)
    List<Artist> descendingOrderDateOfBirth();

    // List all Artist Based on their date of birth (Ascending order)
    @Query(value = "SELECT * FROM java_bootcamp.artist t ORDER BY date_of_birth ASC", nativeQuery = true)
    List<Artist> ascendingOrderDateOfBirth();
}
