package com.example.TWmovie.Repositories;

import com.example.TWmovie.entities.Movie;
import org.springframework.data.repository.CrudRepository;

public interface MovieRepository extends CrudRepository<Movie, Integer> {
}
