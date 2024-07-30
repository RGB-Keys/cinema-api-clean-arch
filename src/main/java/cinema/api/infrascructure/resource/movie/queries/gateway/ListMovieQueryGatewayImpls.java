package cinema.api.infrascructure.resource.movie.queries.gateway;

import cinema.api.core.domain.movie.MovieDomain;
import cinema.api.core.useCases.movie.findAll.query.ListMovieQuery;
import cinema.api.core.useCases.movie.findAll.query.ListMovieQueryGateway;
import cinema.api.data.mappers.movie.queries.ListMovieMapper;
import cinema.api.data.repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ListMovieQueryGatewayImpls implements ListMovieQueryGateway {

    @Autowired
    private ListMovieMapper mapper;

    @Autowired
    private MovieRepository repository;

    @Override
    public List<ListMovieQuery> list(List<MovieDomain> movie) {
        var response = mapper.toListResponse(movie);
        return mapper.toListQuery(response);
    }
}
