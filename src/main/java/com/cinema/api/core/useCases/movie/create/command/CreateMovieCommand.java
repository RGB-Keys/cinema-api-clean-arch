package cinema.api.core.useCases.movie.create.command;

import cinema.api.data.enums.Classification;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class CreateMovieCommand {

    private String title;
    private String genre;
    private Classification classification;
    private String duration;
    private String synopsis;
    private String idiom;

}