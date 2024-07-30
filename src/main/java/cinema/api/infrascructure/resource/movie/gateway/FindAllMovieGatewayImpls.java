package cinema.api.infrascructure.resource.movie.gateway;

import cinema.api.core.domain.movie.MovieDomain;
import cinema.api.core.domain.movie.gateway.FindAllMovieGateway;
import cinema.api.data.mappers.movie.MovieMapper;
import cinema.api.data.repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class FindAllMovieGatewayImpls implements FindAllMovieGateway {

    @Autowired
    private MovieRepository repository;

    @Autowired
    private MovieMapper mapper;

    @Override
    public List<MovieDomain> execute() {
        return repository.findAll()
                .stream()
                .map(mapper::toDomain)
                .collect(Collectors.toList());
    }
}
