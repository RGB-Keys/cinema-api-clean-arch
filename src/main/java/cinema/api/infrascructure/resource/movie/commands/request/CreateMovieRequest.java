package cinema.api.infrascructure.resource.movie.commands.request;

import cinema.api.data.enums.Classification;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;

@Builder
public record CreateMovieRequest(
        @NotBlank
        String title,
        @NotBlank
        String genre,
        @NotNull
        Classification classification,
        @NotBlank
        String duration,
        @NotBlank
        String synopsis,
        @NotBlank
        String idiom
) {
}
