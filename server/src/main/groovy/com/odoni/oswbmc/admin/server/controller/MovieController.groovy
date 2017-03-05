package com.odoni.oswbmc.admin.server.controller

import com.odoni.oswbmc.admin.server.model.Movie
import com.odoni.oswbmc.admin.server.service.MovieService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(value = "/movie")
class MovieController {

    @Autowired
    MovieService movieService

    @RequestMapping(method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_UTF8_VALUE,
            produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    Movie create(@RequestBody Movie movie) {
        movieService.create(movie)
    }

    @RequestMapping(method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    Movie findByTitle(@RequestParam(value="title", required = true) String title) {
        movieService.findByTitle(title)
    }

    @RequestMapping(value = "/all",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseBody List<Movie> findAll() {
        movieService.findAll()
    }

    @RequestMapping(value = "/{id}",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    Movie findById(@PathVariable(value="id") String id) {
        movieService.findById(id)
    }

    @RequestMapping(method = RequestMethod.PUT,
            consumes = MediaType.APPLICATION_JSON_UTF8_VALUE,
            produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    Movie update(@RequestBody Movie movie) {
        movieService.update(movie)
    }

    @RequestMapping(value = "/{id}",
            method = RequestMethod.DELETE)
    void delete(@PathVariable(value="id") String id) {
        movieService.delete(id)
    }
}
