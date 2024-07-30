package cinema.api.infrascructure.resource.movie.queries.response;

import cinema.api.data.enums.Classification;
import lombok.Builder;

@Builder
public record MovieResponse(
        Long id,
        String title,
        String genre,
        Classification classification,
        String duration,
        String synopsis,
        String idiom
) {
}
