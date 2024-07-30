package cinema.api.data.mappers.movie.queries;

import cinema.api.core.domain.movie.MovieDomain;
import cinema.api.core.useCases.movie.findAll.query.ListMovieQuery;
import cinema.api.data.schema.MovieSchema;
import cinema.api.infrascructure.resource.movie.queries.response.MovieResponse;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ListMovieMapper implements QueryMapper<MovieDomain, ListMovieQuery, MovieResponse>{

    private final ModelMapper modelMapper;

    public ListMovieMapper(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    @Override
    public MovieResponse toResponse(MovieDomain movieDomain) {
        return MovieResponse.builder()
                .id(movieDomain.getId())
                .title(movieDomain.getTitle())
                .genre(movieDomain.getGenre())
                .classification(movieDomain.getClassification())
                .duration(movieDomain.getDuration())
                .synopsis(movieDomain.getDuration())
                .idiom(movieDomain.getIdiom())
                .build();
    }

    @Override
    public ListMovieQuery toQuery(MovieResponse response) {
        return ListMovieQuery.builder()
                .id(response.id())
                .title(response.title())
                .genre(response.genre())
                .classification(response.classification())
                .duration(response.duration())
                .synopsis(response.synopsis())
                .idiom(response.idiom())
                .build();
    }

    @Override
    public List<MovieResponse> toListResponse(List<MovieDomain> movieDomain) {
        return movieDomain.stream()
                .map(this::toResponse)
                .collect(Collectors.toList());
    }

    @Override
    public List<ListMovieQuery> toListQuery(List<MovieResponse> response) {
        return response.stream()
                .map(this::toQuery)
                .collect(Collectors.toList());
    }
}
