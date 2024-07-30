package cinema.api.core.domain.movie.gateway;

import cinema.api.core.domain.movie.MovieDomain;

public interface SaveMovieGateway {
    MovieDomain execute(MovieDomain movie);
}
