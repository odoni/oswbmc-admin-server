package com.odoni.oswbmc.admin.server.service

import com.odoni.oswbmc.admin.server.model.Movie
import org.springframework.stereotype.Service

@Service
interface MovieService {
    Movie create(Movie movie)
    Movie findByTitle(String title)
    Movie findById(String id)
    List<Movie> findAll()
    Movie update(Movie movie)
    void delete(String id)
}