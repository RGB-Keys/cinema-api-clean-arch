package cinema.api.core.useCases.movie.findAll.query;

import cinema.api.core.domain.movie.MovieDomain;

import java.util.List;

public interface ListMovieQueryGateway {
    List<ListMovieQuery> list(List<MovieDomain> movie);
}
