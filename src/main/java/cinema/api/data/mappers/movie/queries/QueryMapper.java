package cinema.api.data.mappers.movie.queries;

import java.util.List;

public interface QueryMapper<Domain, Query, Response> {

    Response toResponse(Domain domain);

    Query toQuery(Response response);

    List<Response> toListResponse(List<Domain> domain);

    List<Query> toListQuery(List<Response> response);

}
