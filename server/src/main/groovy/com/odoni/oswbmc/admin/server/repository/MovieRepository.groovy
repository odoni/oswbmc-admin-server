package com.odoni.oswbmc.admin.server.repository

import com.odoni.oswbmc.admin.server.model.Movie
import org.springframework.data.mongodb.repository.MongoRepository

interface MovieRepository extends MongoRepository<Movie, String> {
    Movie findByTitle(String title)
    Movie findById(String id)
    List<Movie> findAll()
}