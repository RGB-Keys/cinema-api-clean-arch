package cinema.api.infrascructure.resource.movie.commands;

import cinema.api.core.domain.movie.MovieDomain;
import cinema.api.core.useCases.movie.create.CreateMovieHandler;
import cinema.api.infrascructure.resource.movie.commands.request.CreateMovieRequest;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movie")
public class CreateMovieController {

    @Autowired
    private CreateMovieHandler createMovieHandler;

    @PostMapping
    public MovieDomain create(@RequestBody @Valid CreateMovieRequest request) {
        return createMovieHandler.create(request);
    }

}

