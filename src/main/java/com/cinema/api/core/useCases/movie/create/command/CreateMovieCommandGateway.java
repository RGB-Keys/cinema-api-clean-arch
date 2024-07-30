package cinema.api.core.useCases.movie.create.command;

import cinema.api.infrascructure.resource.movie.commands.request.CreateMovieRequest;

public interface CreateMovieCommandGateway {
    CreateMovieCommand create(CreateMovieRequest request);
}