package cinema.api.infrascructure.resource.movie.gateway;

import cinema.api.core.domain.movie.MovieDomain;
import cinema.api.core.domain.movie.gateway.SaveMovieGateway;
import cinema.api.data.mappers.movie.MovieMapper;
import cinema.api.data.repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SaveProductGatewayImpls implements SaveMovieGateway {
    
    @Autowired
    private MovieMapper mapper;
    @Autowired
    private MovieRepository repository;
    
    @Override
    public MovieDomain execute(MovieDomain movie) {
        var movieSchema = repository.save(mapper.toSchema(movie));
        return mapper.toDomain(movieSchema);
    }
}
