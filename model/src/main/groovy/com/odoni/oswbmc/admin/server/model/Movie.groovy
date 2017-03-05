package com.odoni.oswbmc.admin.server.model

import groovy.transform.ToString
import org.springframework.data.annotation.Id

@ToString(includeNames=true, includeFields=true)
class Movie {

    @Id
    String id
    String title
    String year
    String rated
    String released
    String runtime
    String genre
    String director
    String writer
    String actors
    String plotShort
    String plotFull
    String language
    String country
    String awards
    String poster
    String metascore
    String imdbRating
    String imdbVotes
    String imdbID
    String type
    String response
    String file
}
