package Domain

import java.time.OffsetDateTime

class Entity extends BaseEntity implements IEntity {
    UUID token
    String name
    String lastName
    OffsetDateTime createdAt
    OffsetDateTime updatedAt

    Entity(String name, String lastName){
        token = UUID.randomUUID()
        this.name = name
        this.lastName = lastName
        createdAt = GetDateTime()
    }

    Entity(UUID token, String name, String lastName){
        this.token = token
        this.name = name
        this.lastName = lastName
        createdAt = GetDateTime()
    }

    @Override
    String toString() {
        return "$token -> $name $lastName CreatedAt $createdAt and UpdatedAt $updatedAt"
    }
}
