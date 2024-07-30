package cinema.api.core.domain.movie.gateway;

import cinema.api.core.domain.movie.MovieDomain;

import java.util.List;

public interface FindAllMovieGateway {
    List<MovieDomain> execute();
}
