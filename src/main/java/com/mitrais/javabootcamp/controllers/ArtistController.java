package com.mitrais.javabootcamp.controllers;

import com.mitrais.javabootcamp.models.Artist;
import com.mitrais.javabootcamp.services.implementations.ArtistServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/artist")
public class ArtistController {

    private final ArtistServiceImpl artistService;
    private final Logger LOG = LoggerFactory.getLogger(getClass());

    @Autowired
    public ArtistController(ArtistServiceImpl artistService) {
        this.artistService = artistService;
    }

    @GetMapping
    public List<Artist> getAllArtist() {
        LOG.info("Getting All Artist");
        return artistService.getAllArtist();
    }

    @PostMapping
    public Artist createArtist(@RequestBody Artist artist) {
        LOG.info("Insert An Artist into Database");
        return artistService.createArtist(artist);
    }

    @GetMapping("/orderedByDateOfBirth")
    public List<Artist> orderArtistByDateOfBirth(@RequestParam String keyword) {
        LOG.info("Ordered artist by their date of birth: " + keyword);
        return artistService.getAllArtistOrderedByDateOfBirth(keyword);
    }

//    @GetMapping("/orderStream")
//    public List<Artist> orderArtistByDateOfBirthStream(@RequestParam String keyword) {
//        LOG.info("Ordered artist by their date of birth: " + keyword);
//        long startTime = System.currentTimeMillis();
//
//        List<Artist> orderedList = artistService.getAllArtistOrderedByDateOfBirthStream(keyword);
//
//        long endTime = System.currentTimeMillis();
//        System.out.println(endTime - startTime);
//
//        return orderedList;
////        return artistService.getAllArtistOrderedByDateOfBirth(keyword);
//    }
}
