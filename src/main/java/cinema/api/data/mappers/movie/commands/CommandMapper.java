package cinema.api.data.mappers.movie.commands;

public interface CommandMapper<Command, Request> {
    
    Command toCommand(Request request);

}
