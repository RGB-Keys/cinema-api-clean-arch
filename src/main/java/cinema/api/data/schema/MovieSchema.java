package cinema.api.data.schema;

import cinema.api.data.enums.Classification;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Entity
@Table(name = "movies")
public class MovieSchema {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_movie")
    @Id
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "genre")
    private String genre;

    @Column(name = "classification")
    private Classification classification;

    @Column(name = "duration")
    private String duration;

    @Column(name = "synopsis")
    private String synopsis;

    @Column(name = "idiom")
    private String idiom;
}
