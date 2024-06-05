package Domain

import java.time.OffsetDateTime

interface IEntity {
    SetName(String name)
    SetLastName(String lastName)
    UUID Token()
    String Name()
    String LastName()
    String TokenToString()
    OffsetDateTime CreatedAt()
    OffsetDateTime UpdatedAt()
}