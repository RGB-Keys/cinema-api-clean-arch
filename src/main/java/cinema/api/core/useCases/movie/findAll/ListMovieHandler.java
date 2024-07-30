package cinema.api.core.useCases.movie.findAll;

import cinema.api.core.domain.movie.gateway.FindAllMovieGateway;
import cinema.api.core.useCases.movie.findAll.query.ListMovieQuery;
import cinema.api.core.useCases.movie.findAll.query.ListMovieQueryGateway;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ListMovieHandler {

    private final FindAllMovieGateway findAllMovieGateway;
    private final ListMovieQueryGateway listMovieQueryGateway;

    public ListMovieHandler(FindAllMovieGateway findAllMovieGateway, ListMovieQueryGateway listMovieQueryGateway) {
        this.findAllMovieGateway = findAllMovieGateway;
        this.listMovieQueryGateway = listMovieQueryGateway;
    }

    public List<ListMovieQuery> list(){
        var movie = findAllMovieGateway.execute();
        return listMovieQueryGateway.list(movie);
    }

}
