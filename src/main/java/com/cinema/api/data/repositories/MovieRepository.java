package cinema.api.data.repositories;

import cinema.api.data.schema.MovieSchema;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<MovieSchema, Long> {
}
