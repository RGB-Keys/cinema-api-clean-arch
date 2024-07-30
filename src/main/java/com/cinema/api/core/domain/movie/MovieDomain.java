package cinema.api.core.domain.movie;

import cinema.api.data.enums.Classification;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MovieDomain {

    private Long id;

    private String title;

    private String genre;

    private Classification classification;

    private String duration;

    private String synopsis;

    private String idiom;

}
