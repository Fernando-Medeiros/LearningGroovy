package Domain
import groovy.transform.Canonical
import java.time.OffsetDateTime

@Canonical
class Entity extends BaseEntity implements IEntity, Serializable {
    String name
    String lastName
    UUID token = UUID.randomUUID()
    OffsetDateTime createdAt = GetDateTime()
    OffsetDateTime updatedAt = GetDateTime()
}
