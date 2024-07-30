package cinema.api.data.mappers;

public interface Mapper<Domain, Schema> {

    Domain toDomain(Schema schema);

    Schema toSchema(Domain command);
}
