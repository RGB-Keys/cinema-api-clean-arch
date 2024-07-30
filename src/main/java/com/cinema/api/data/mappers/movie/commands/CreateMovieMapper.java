package cinema.api.data.mappers.movie.commands;

import cinema.api.core.useCases.movie.create.command.CreateMovieCommand;
import cinema.api.infrascructure.resource.movie.commands.request.CreateMovieRequest;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class CreateMovieMapper implements CommandMapper<CreateMovieCommand, CreateMovieRequest> {

    private final ModelMapper modelMapper;

    public CreateMovieMapper(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    @Override
    public CreateMovieCommand toCommand(CreateMovieRequest request) {
        return CreateMovieCommand.builder()
                .title(request.title())
                .genre(request.genre())
                .classification(request.classification())
                .duration(request.duration())
                .synopsis(request.synopsis())
                .idiom(request.idiom())
                .build();
    }

}
