package cinema.api.infrascructure.resource.movie.queries;


import cinema.api.core.domain.movie.MovieDomain;
import cinema.api.core.useCases.movie.findAll.ListMovieHandler;
import cinema.api.core.useCases.movie.findAll.query.ListMovieQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/movie")
public class MovieQueryController {

    @Autowired
    private ListMovieHandler listMovieHandler;

    @GetMapping
    public List<ListMovieQuery> list(){
        return listMovieHandler.list();
    }
}
