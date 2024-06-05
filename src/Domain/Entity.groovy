package Domain

import java.time.LocalDateTime
import java.time.OffsetDateTime
import java.time.ZoneOffset

class Entity extends BaseEntity implements IEntity {
    private UUID _token
    private String _name
    private String _lastName
    private OffsetDateTime _createdAt
    private OffsetDateTime _updatedAt

    Entity(String name, String lastName){
        _token = UUID.randomUUID()
        _name = name
        _lastName = lastName
        _createdAt = new OffsetDateTime(LocalDateTime.now(), ZoneOffset.UTC)
    }

    Entity(UUID token, String name, String lastName){
        _token = token
        _name = name
        _lastName = lastName
        _createdAt = new OffsetDateTime(LocalDateTime.now(), ZoneOffset.UTC)
    }

    @Override
    def SetName(String name) {
        _name = name
        SetUpdatedAt()
    }

    @Override
    def SetLastName(String lastName) {
        _lastName = lastName
        SetUpdatedAt()
    }

    @Override
    UUID Token() {
        return _token
    }

    @Override
    String Name() {
        return  _name
    }

    @Override
    String LastName() {
        return _lastName
    }

    @Override
    String TokenToString() {
        return _token.toString()
    }

    @Override
    OffsetDateTime CreatedAt() {
        return _createdAt
    }

    @Override
    OffsetDateTime UpdatedAt() {
        return _updatedAt
    }

    private SetUpdatedAt(){
        _updatedAt = new OffsetDateTime(LocalDateTime.now(), ZoneOffset.UTC)
    }

    @Override
    String toString() {
        return "$_token -> $_name $_lastName CreatedAt $_createdAt and UpdatedAt $_updatedAt"
    }
}
