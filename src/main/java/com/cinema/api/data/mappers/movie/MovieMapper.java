package cinema.api.data.mappers.movie;

import cinema.api.core.domain.movie.MovieDomain;
import cinema.api.data.mappers.Mapper;
import cinema.api.data.schema.MovieSchema;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class MovieMapper implements Mapper<MovieDomain, MovieSchema> {

    private final ModelMapper mapper;

    public MovieMapper(ModelMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public MovieDomain toDomain(MovieSchema movieSchema) {
        return MovieDomain.builder()
                .id(movieSchema.getId())
                .title(movieSchema.getTitle())
                .genre(movieSchema.getGenre())
                .classification(movieSchema.getClassification())
                .duration(movieSchema.getDuration())
                .synopsis(movieSchema.getSynopsis())
                .idiom(movieSchema.getIdiom())
                .build();
    }

    @Override
    public MovieSchema toSchema(MovieDomain movieDomain) {
        return MovieSchema.builder()
                .id(movieDomain.getId())
                .title(movieDomain.getTitle())
                .genre(movieDomain.getGenre())
                .classification(movieDomain.getClassification())
                .duration(movieDomain.getDuration())
                .synopsis(movieDomain.getSynopsis())
                .idiom(movieDomain.getIdiom())
                .build();
    }
}
