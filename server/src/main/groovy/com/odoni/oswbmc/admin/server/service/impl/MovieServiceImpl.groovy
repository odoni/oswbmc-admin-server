package com.odoni.oswbmc.admin.server.service.impl

import com.odoni.oswbmc.admin.server.model.Movie
import com.odoni.oswbmc.admin.server.repository.MovieRepository
import com.odoni.oswbmc.admin.server.service.MovieService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class MovieServiceImpl implements MovieService {

    @Autowired
    MovieRepository repository

    @Override
    Movie create(Movie movie) {
        return repository.save(movie)
    }

    @Override
    Movie findByTitle(String title) {
        return repository.findByTitle(title)
    }

    @Override
    Movie findById(String id) {
        return repository.findById(id)
    }

    @Override
    List<Movie> findAll() {
        return repository.findAll()
    }

    @Override
    Movie update(Movie movie) {
        return repository.save(movie)
    }

    @Override
    void delete(String id) {
        repository.delete(id)
    }
}
