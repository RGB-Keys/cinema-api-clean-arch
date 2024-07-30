package cinema.api.infrascructure.resource.movie.commands.gateway;

import cinema.api.core.useCases.movie.create.command.CreateMovieCommand;
import cinema.api.core.useCases.movie.create.command.CreateMovieCommandGateway;
import cinema.api.data.mappers.movie.commands.CreateMovieMapper;
import cinema.api.data.repositories.MovieRepository;
import cinema.api.infrascructure.resource.movie.commands.request.CreateMovieRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CreateMovieGatewayImpls implements CreateMovieCommandGateway {

    @Autowired
    private CreateMovieMapper mapper;

    @Autowired
    private MovieRepository repository;

    @Override
    public CreateMovieCommand create(CreateMovieRequest request) {
        return mapper.toCommand(request);
    }
}
