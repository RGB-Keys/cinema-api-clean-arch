package cinema.api.core.useCases.movie.create;

import cinema.api.core.useCases.movie.create.command.CreateMovieCommandGateway;
import cinema.api.core.domain.movie.MovieDomain;
import cinema.api.core.domain.movie.gateway.SaveMovieGateway;
import cinema.api.data.mappers.movie.commands.CreateMovieMapper;
import cinema.api.infrascructure.resource.movie.commands.request.CreateMovieRequest;
import org.springframework.stereotype.Component;

@Component
public class CreateMovieHandler {

    private final CreateMovieCommandGateway createMovieCommandGateway;
    private final SaveMovieGateway saveMovieGateway;

    public CreateMovieHandler(CreateMovieCommandGateway createMovieGateway,
                              CreateMovieMapper createMovieMapper, SaveMovieGateway saveMovieGateway) {
        this.createMovieCommandGateway = createMovieGateway;
        this.saveMovieGateway = saveMovieGateway;
    }

    public MovieDomain create(CreateMovieRequest request) {
        var command = createMovieCommandGateway.create(request);

        var movie = MovieDomain.builder()
                .title(command.getTitle())
                .genre(command.getGenre())
                .classification(command.getClassification())
                .duration(command.getDuration())
                .synopsis(command.getSynopsis())
                .idiom(command.getIdiom())
                .build();

        return saveMovieGateway.execute(movie);
    }

}
