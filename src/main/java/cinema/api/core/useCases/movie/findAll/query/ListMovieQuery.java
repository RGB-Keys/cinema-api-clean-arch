package cinema.api.core.useCases.movie.findAll.query;

import cinema.api.data.enums.Classification;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class ListMovieQuery {

    private Long id;
    private String title;
    private String genre;
    private Classification classification;
    private String duration;
    private String synopsis;
    private String idiom;

}
