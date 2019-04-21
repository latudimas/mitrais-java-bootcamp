package com.mitrais.javabootcamp.repositories;

import com.mitrais.javabootcamp.models.Album;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlbumRepository extends JpaRepository<Album, Long> {
}
