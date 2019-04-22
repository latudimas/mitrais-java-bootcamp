package com.mitrais.javabootcamp.controllers;

import com.mitrais.javabootcamp.models.Album;
import com.mitrais.javabootcamp.services.implementations.AlbumServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/album")
public class AlbumController {

    private final AlbumServiceImpl albumService;
    private final Logger LOG = LoggerFactory.getLogger(getClass());

    @Autowired
    public AlbumController(AlbumServiceImpl albumService) {
        this.albumService = albumService;
    }

    @GetMapping
    public List<Album> getAllAlbum() {
        LOG.info("Getting All Album");
        return albumService.getAllAlbum();
    }

    @PostMapping
    public Album createAlbum(@RequestBody Album album) {
        LOG.info("Insert an Album into database");
        return albumService.createAlbum(album);
    }

    @GetMapping("/{id}")
    public List<Album> getAlbumByArtistId(@PathVariable Long id) {
        LOG.info("Get Album by Artist Id");
        return albumService.getAlbumByArtistId(id);
    }

    @GetMapping("/search")
    public List<Album> getAlbumByArtistName(@RequestParam("firstName") String firstName) {
        LOG.info("Get Album by Artist First Name : " + firstName);
        return albumService.getAlbumByArtistName(firstName);
    }

    @GetMapping("/stream/{id}")
    public List<Album> getAlbumByStream(@PathVariable Long id) {
        LOG.info("Get album by artist id using stream");
        return albumService.getAlbumUsingStream(id);
    }
}
